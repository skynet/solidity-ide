/**
 * Copyright (c) 2017 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	Andreas Muelder - Itemis AG - initial API and implementation
 * 	Karsten Thoms   - Itemis AG - initial API and implementation
 * 	Florian Antony  - Itemis AG - initial API and implementation
 * 	committers of YAKINDU 
 * 
 */
package com.yakindu.solidity.ui.help;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.yakindu.base.types.Property;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * @author Florian Antony
 * 
 */
public class SolidityUserHelpDocumentationProvider implements IEObjectDocumentationProvider {
	// @formatter:off
	private static final ImmutableMap<String, String> PERMALINKS = ImmutableMap.<String, String>builder()
			.put("pragma", "https://solidity.readthedocs.io/en/develop/layout-of-source-files.html#version-pragma")

			.put("contract",
					"https://solidity.readthedocs.io/en/develop/structure-of-a-contract.html#structure-of-a-contract")

			.put("interface", "http://solidity.readthedocs.io/en/develop/contracts.html#interfaces")

			.put("library", "http://solidity.readthedocs.io/en/develop/contracts.html#libraries")

			.put("mapping", "http://solidity.readthedocs.io/en/develop/types.html#mappings")

			.put("enum", "http://solidity.readthedocs.io/en/develop/types.html#enums")

			.put("modifier", "http://solidity.readthedocs.io/en/develop/contracts.html#function-modifiers")

			.put("public", "http://solidity.readthedocs.io/en/develop/contracts.html#visibility-and-getters")
			.put("internal", "http://solidity.readthedocs.io/en/develop/contracts.html#visibility-and-getters")
			.put("private", "http://solidity.readthedocs.io/en/develop/contracts.html#visibility-and-getters")

			.put("block",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("blockhash",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("coinbase",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("difficulty",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("gaslimit",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("number",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("timestamp",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("msg",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("data",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("gas",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("sender",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("sig",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("value",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("now",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("tx",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("gasprice",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")
			.put("origin",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#special-variables-and-functions")

			.put("this", "http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#contract-related")
			.put("suicide",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#contract-related")
			.put("selfdestruct",
					"http://solidity.readthedocs.io/en/develop/units-and-global-variables.html#contract-related")
			.build();
	// TODO: Complete
	// @formatter:on
	private LoadingCache<String, String> cache = CacheBuilder.newBuilder().maximumSize(100)
			.expireAfterWrite(1, TimeUnit.HOURS).build(new CacheLoader<String, String>() {
				public String load(String key) {
					return getDocumentationInternal(key);
				}
			});

	@Inject
	private MultiLineCommentDocumentationProvider delegate;

	protected String getDocumentationInternal(String url) {
		StringBuilder builder = new StringBuilder();
		URL content;
		try {
			content = new URL(url);
			BufferedReader in = new BufferedReader(new InputStreamReader(content.openStream()));
			String inputLine;
			boolean record = false;
			while ((inputLine = in.readLine()) != null) {
				String tag = url.substring(url.indexOf("#") + 1);
				if (inputLine.contains(String.format("<div class=\"section\" id=\"%s\">", tag))) {
					record = true;
				} else if (inputLine.contains("div class=\"rst-footer-buttons\"")) {
					record = false;
				}
				if (record)
					builder.append(inputLine);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}

	@Override
	public String getDocumentation(EObject o) {
		String url = null;
		if (o instanceof Keyword) {
			url = PERMALINKS.get(((Keyword) o).getValue());
		}
		if (o instanceof Property) {
			url = PERMALINKS.get(((Property) o).getName());
		}
		String documentation = getDocumentationFromCache(url);
		if (documentation != null)
			return documentation;
		return delegate.getDocumentation(o);
	}

	private String getDocumentationFromCache(String url) {
		if (url != null) {
			try {
				return cache.get(url);
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
