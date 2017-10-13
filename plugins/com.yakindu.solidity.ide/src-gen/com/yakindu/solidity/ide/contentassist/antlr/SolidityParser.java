/*
 * generated by Xtext 2.12.0
 */
package com.yakindu.solidity.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.yakindu.solidity.ide.contentassist.antlr.internal.InternalSolidityParser;
import com.yakindu.solidity.services.SolidityGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SolidityParser extends AbstractContentAssistParser {

	@Inject
	private SolidityGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSolidityParser createParser() {
		InternalSolidityParser result = new InternalSolidityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSourceUnitAccess().getAlternatives(), "rule__SourceUnit__Alternatives");
					put(grammarAccess.getContractPartAccess().getPartsAlternatives_0(), "rule__ContractPart__PartsAlternatives_0");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getFunctionDefinitionAccess().getAlternatives_3(), "rule__FunctionDefinition__Alternatives_3");
					put(grammarAccess.getFunctionDefinitionAccess().getAlternatives_5(), "rule__FunctionDefinition__Alternatives_5");
					put(grammarAccess.getLogicalNotExpressionAccess().getAlternatives(), "rule__LogicalNotExpression__Alternatives");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getAlternatives(), "rule__NumericalUnaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getFeatureCallAccess().getAlternatives_1_3(), "rule__FeatureCall__Alternatives_1_3");
					put(grammarAccess.getElementReferenceExpressionAccess().getAlternatives_2(), "rule__ElementReferenceExpression__Alternatives_2");
					put(grammarAccess.getExpressionsLiteralAccess().getAlternatives(), "superLiteral__Alternatives");
					put(grammarAccess.getContractTypeAccess().getAlternatives(), "rule__ContractType__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getAssignmentOperatorAccess().getAlternatives(), "rule__AssignmentOperator__Alternatives");
					put(grammarAccess.getShiftOperatorAccess().getAlternatives(), "rule__ShiftOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getPragmaDirectiveAccess().getGroup(), "rule__PragmaDirective__Group__0");
					put(grammarAccess.getImportDirectiveAccess().getGroup(), "rule__ImportDirective__Group__0");
					put(grammarAccess.getImportDirectiveAccess().getGroup_2(), "rule__ImportDirective__Group_2__0");
					put(grammarAccess.getContractDefinitionAccess().getGroup(), "rule__ContractDefinition__Group__0");
					put(grammarAccess.getContractDefinitionAccess().getGroup_2(), "rule__ContractDefinition__Group_2__0");
					put(grammarAccess.getContractDefinitionAccess().getGroup_2_2(), "rule__ContractDefinition__Group_2_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3(), "rule__VariableDeclaration__Group_3__0");
					put(grammarAccess.getStructDefinitionAccess().getGroup(), "rule__StructDefinition__Group__0");
					put(grammarAccess.getStructDefinitionAccess().getGroup_3(), "rule__StructDefinition__Group_3__0");
					put(grammarAccess.getModifierDefinitionAccess().getGroup(), "rule__ModifierDefinition__Group__0");
					put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
					put(grammarAccess.getParameterListAccess().getGroup_3(), "rule__ParameterList__Group_3__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_2(), "rule__Block__Group_2__0");
					put(grammarAccess.getModifierInvocationLiteralAccess().getGroup(), "rule__ModifierInvocationLiteral__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_4(), "rule__FunctionDefinition__Group_4__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getEventDefinitionAccess().getGroup(), "rule__EventDefinition__Group__0");
					put(grammarAccess.getEnumDefinitionAccess().getGroup(), "rule__EnumDefinition__Group__0");
					put(grammarAccess.getEnumDefinitionAccess().getGroup_4(), "rule__EnumDefinition__Group_4__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup(), "rule__AssignmentExpression__Group__0");
					put(grammarAccess.getAssignmentExpressionAccess().getGroup_1(), "rule__AssignmentExpression__Group_1__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getLogicalNotExpressionAccess().getGroup_1(), "rule__LogicalNotExpression__Group_1__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup(), "rule__BitwiseXorExpression__Group__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup_1(), "rule__BitwiseXorExpression__Group_1__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup(), "rule__BitwiseOrExpression__Group__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1(), "rule__BitwiseOrExpression__Group_1__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup(), "rule__BitwiseAndExpression__Group__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1(), "rule__BitwiseAndExpression__Group_1__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup(), "rule__LogicalRelationExpression__Group__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup_1(), "rule__LogicalRelationExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup(), "rule__NumericalAddSubtractExpression__Group__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup_1(), "rule__NumericalAddSubtractExpression__Group_1__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup_1_0(), "rule__NumericalAddSubtractExpression__Group_1_0__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup(), "rule__NumericalMultiplyDivideExpression__Group__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup_1(), "rule__NumericalMultiplyDivideExpression__Group_1__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup_1_0(), "rule__NumericalMultiplyDivideExpression__Group_1_0__0");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getGroup_1(), "rule__NumericalUnaryExpression__Group_1__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup(), "rule__TypeCastExpression__Group__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup_1(), "rule__TypeCastExpression__Group_1__0");
					put(grammarAccess.getTypeCastExpressionAccess().getGroup_1_0(), "rule__TypeCastExpression__Group_1_0__0");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getGroup(), "rule__PrimitiveValueExpression__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup(), "rule__FeatureCall__Group__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1(), "rule__FeatureCall__Group_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0(), "rule__FeatureCall__Group_1_3_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0_1(), "rule__FeatureCall__Group_1_3_0_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_0_1_1(), "rule__FeatureCall__Group_1_3_0_1_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1(), "rule__FeatureCall__Group_1_3_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_0(), "rule__FeatureCall__Group_1_3_1_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_0_0(), "rule__FeatureCall__Group_1_3_1_0_0__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_1(), "rule__FeatureCall__Group_1_3_1_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_3_1_1_0(), "rule__FeatureCall__Group_1_3_1_1_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup(), "rule__ElementReferenceExpression__Group__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0(), "rule__ElementReferenceExpression__Group_2_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0_1(), "rule__ElementReferenceExpression__Group_2_0_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_0_1_1(), "rule__ElementReferenceExpression__Group_2_0_1_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1(), "rule__ElementReferenceExpression__Group_2_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_0(), "rule__ElementReferenceExpression__Group_2_1_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_0_0(), "rule__ElementReferenceExpression__Group_2_1_0_0__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_1(), "rule__ElementReferenceExpression__Group_2_1_1__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup_2_1_1_0(), "rule__ElementReferenceExpression__Group_2_1_1_0__0");
					put(grammarAccess.getArgumentAccess().getGroup(), "rule__Argument__Group__0");
					put(grammarAccess.getArgumentAccess().getGroup_0(), "rule__Argument__Group_0__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup(), "rule__TypeSpecifier__Group__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1(), "rule__TypeSpecifier__Group_1__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1_1(), "rule__TypeSpecifier__Group_1_1__0");
					put(grammarAccess.getTypeSpecifierAccess().getGroup_1_1_1(), "rule__TypeSpecifier__Group_1_1_1__0");
					put(grammarAccess.getBoolLiteralAccess().getGroup(), "rule__BoolLiteral__Group__0");
					put(grammarAccess.getIntLiteralAccess().getGroup(), "rule__IntLiteral__Group__0");
					put(grammarAccess.getDoubleLiteralAccess().getGroup(), "rule__DoubleLiteral__Group__0");
					put(grammarAccess.getFloatLiteralAccess().getGroup(), "rule__FloatLiteral__Group__0");
					put(grammarAccess.getHexLiteralAccess().getGroup(), "rule__HexLiteral__Group__0");
					put(grammarAccess.getBinaryLiteralAccess().getGroup(), "rule__BinaryLiteral__Group__0");
					put(grammarAccess.getStringLiteralAccess().getGroup(), "rule__StringLiteral__Group__0");
					put(grammarAccess.getNullLiteralAccess().getGroup(), "rule__NullLiteral__Group__0");
					put(grammarAccess.getQIDAccess().getGroup(), "rule__QID__Group__0");
					put(grammarAccess.getQIDAccess().getGroup_1(), "rule__QID__Group_1__0");
					put(grammarAccess.getSolidityModelAccess().getSourceunitAssignment(), "rule__SolidityModel__SourceunitAssignment");
					put(grammarAccess.getPragmaDirectiveAccess().getIdAssignment_2(), "rule__PragmaDirective__IdAssignment_2");
					put(grammarAccess.getImportDirectiveAccess().getImportedNamespaceAssignment_1(), "rule__ImportDirective__ImportedNamespaceAssignment_1");
					put(grammarAccess.getImportDirectiveAccess().getAliasAssignment_2_1(), "rule__ImportDirective__AliasAssignment_2_1");
					put(grammarAccess.getContractDefinitionAccess().getTypeAssignment_0(), "rule__ContractDefinition__TypeAssignment_0");
					put(grammarAccess.getContractDefinitionAccess().getNameAssignment_1(), "rule__ContractDefinition__NameAssignment_1");
					put(grammarAccess.getContractDefinitionAccess().getSuperTypeAssignment_2_1(), "rule__ContractDefinition__SuperTypeAssignment_2_1");
					put(grammarAccess.getContractDefinitionAccess().getSuperTypeAssignment_2_2_1(), "rule__ContractDefinition__SuperTypeAssignment_2_2_1");
					put(grammarAccess.getContractDefinitionAccess().getPartsAssignment_4(), "rule__ContractDefinition__PartsAssignment_4");
					put(grammarAccess.getInheritanceSpecifierAccess().getNameAssignment(), "rule__InheritanceSpecifier__NameAssignment");
					put(grammarAccess.getContractPartAccess().getPartsAssignment(), "rule__ContractPart__PartsAssignment");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_0(), "rule__VariableDeclaration__TypeAssignment_0");
					put(grammarAccess.getVariableDeclarationAccess().getVisibilityAssignment_1(), "rule__VariableDeclaration__VisibilityAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2(), "rule__VariableDeclaration__NameAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getInitialValueAssignment_3_1(), "rule__VariableDeclaration__InitialValueAssignment_3_1");
					put(grammarAccess.getStructDefinitionAccess().getNameAssignment_1(), "rule__StructDefinition__NameAssignment_1");
					put(grammarAccess.getStructDefinitionAccess().getDeclarationsAssignment_3_0(), "rule__StructDefinition__DeclarationsAssignment_3_0");
					put(grammarAccess.getModifierDefinitionAccess().getNameAssignment_1(), "rule__ModifierDefinition__NameAssignment_1");
					put(grammarAccess.getModifierDefinitionAccess().getListAssignment_2(), "rule__ModifierDefinition__ListAssignment_2");
					put(grammarAccess.getModifierDefinitionAccess().getBlockAssignment_3(), "rule__ModifierDefinition__BlockAssignment_3");
					put(grammarAccess.getParameterListAccess().getParameterAssignment_2(), "rule__ParameterList__ParameterAssignment_2");
					put(grammarAccess.getParameterListAccess().getParameterAssignment_3_1(), "rule__ParameterList__ParameterAssignment_3_1");
					put(grammarAccess.getBlockAccess().getExpressionAssignment_2_0(), "rule__Block__ExpressionAssignment_2_0");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_1(), "rule__FunctionDefinition__NameAssignment_1");
					put(grammarAccess.getFunctionDefinitionAccess().getParameterAssignment_2(), "rule__FunctionDefinition__ParameterAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getReturnParameterAssignment_4_1(), "rule__FunctionDefinition__ReturnParameterAssignment_4_1");
					put(grammarAccess.getFunctionDefinitionAccess().getBlockAssignment_5_1(), "rule__FunctionDefinition__BlockAssignment_5_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getVarArgsAssignment_1(), "rule__Parameter__VarArgsAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeSpecifierAssignment_3(), "rule__Parameter__TypeSpecifierAssignment_3");
					put(grammarAccess.getEventDefinitionAccess().getNameAssignment_1(), "rule__EventDefinition__NameAssignment_1");
					put(grammarAccess.getEnumDefinitionAccess().getNameAssignment_1(), "rule__EnumDefinition__NameAssignment_1");
					put(grammarAccess.getEnumDefinitionAccess().getValueAssignment_3(), "rule__EnumDefinition__ValueAssignment_3");
					put(grammarAccess.getEnumDefinitionAccess().getValueAssignment_4_1(), "rule__EnumDefinition__ValueAssignment_4_1");
					put(grammarAccess.getAssignmentExpressionAccess().getOperatorAssignment_1_1(), "rule__AssignmentExpression__OperatorAssignment_1_1");
					put(grammarAccess.getAssignmentExpressionAccess().getExpressionAssignment_1_2(), "rule__AssignmentExpression__ExpressionAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getTrueCaseAssignment_1_2(), "rule__ConditionalExpression__TrueCaseAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getFalseCaseAssignment_1_4(), "rule__ConditionalExpression__FalseCaseAssignment_1_4");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalNotExpressionAccess().getOperandAssignment_1_2(), "rule__LogicalNotExpression__OperandAssignment_1_2");
					put(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseXorExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalRelationExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalRelationExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalRelationExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getShiftExpressionAccess().getOperatorAssignment_1_1(), "rule__ShiftExpression__OperatorAssignment_1_1");
					put(grammarAccess.getShiftExpressionAccess().getRightOperandAssignment_1_2(), "rule__ShiftExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAssignment_1_0_1(), "rule__NumericalAddSubtractExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandAssignment_1_0_2(), "rule__NumericalAddSubtractExpression__RightOperandAssignment_1_0_2");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorAssignment_1_0_1(), "rule__NumericalMultiplyDivideExpression__OperatorAssignment_1_0_1");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandAssignment_1_0_2(), "rule__NumericalMultiplyDivideExpression__RightOperandAssignment_1_0_2");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalUnaryExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperandAssignment_1_2(), "rule__NumericalUnaryExpression__OperandAssignment_1_2");
					put(grammarAccess.getTypeCastExpressionAccess().getTypeAssignment_1_1(), "rule__TypeCastExpression__TypeAssignment_1_1");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getValueAssignment_1(), "rule__PrimitiveValueExpression__ValueAssignment_1");
					put(grammarAccess.getFeatureCallAccess().getFeatureAssignment_1_2(), "rule__FeatureCall__FeatureAssignment_1_2");
					put(grammarAccess.getFeatureCallAccess().getOperationCallAssignment_1_3_0_0(), "rule__FeatureCall__OperationCallAssignment_1_3_0_0");
					put(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_1_3_0_1_0(), "rule__FeatureCall__ArgumentsAssignment_1_3_0_1_0");
					put(grammarAccess.getFeatureCallAccess().getArgumentsAssignment_1_3_0_1_1_1(), "rule__FeatureCall__ArgumentsAssignment_1_3_0_1_1_1");
					put(grammarAccess.getFeatureCallAccess().getArrayAccessAssignment_1_3_1_0_0_0(), "rule__FeatureCall__ArrayAccessAssignment_1_3_1_0_0_0");
					put(grammarAccess.getFeatureCallAccess().getArraySelectorAssignment_1_3_1_0_0_1(), "rule__FeatureCall__ArraySelectorAssignment_1_3_1_0_0_1");
					put(grammarAccess.getFeatureCallAccess().getArraySelectorAssignment_1_3_1_1_0_1(), "rule__FeatureCall__ArraySelectorAssignment_1_3_1_1_0_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getReferenceAssignment_1(), "rule__ElementReferenceExpression__ReferenceAssignment_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getOperationCallAssignment_2_0_0(), "rule__ElementReferenceExpression__OperationCallAssignment_2_0_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArgumentsAssignment_2_0_1_0(), "rule__ElementReferenceExpression__ArgumentsAssignment_2_0_1_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArgumentsAssignment_2_0_1_1_1(), "rule__ElementReferenceExpression__ArgumentsAssignment_2_0_1_1_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getArrayAccessAssignment_2_1_0_0_0(), "rule__ElementReferenceExpression__ArrayAccessAssignment_2_1_0_0_0");
					put(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorAssignment_2_1_0_0_1(), "rule__ElementReferenceExpression__ArraySelectorAssignment_2_1_0_0_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getArraySelectorAssignment_2_1_1_0_1(), "rule__ElementReferenceExpression__ArraySelectorAssignment_2_1_1_0_1");
					put(grammarAccess.getArgumentAccess().getParameterAssignment_0_0(), "rule__Argument__ParameterAssignment_0_0");
					put(grammarAccess.getArgumentAccess().getValueAssignment_1(), "rule__Argument__ValueAssignment_1");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionAssignment_2(), "rule__ParenthesizedExpression__ExpressionAssignment_2");
					put(grammarAccess.getTypeSpecifierAccess().getTypeAssignment_0(), "rule__TypeSpecifier__TypeAssignment_0");
					put(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsAssignment_1_1_0(), "rule__TypeSpecifier__TypeArgumentsAssignment_1_1_0");
					put(grammarAccess.getTypeSpecifierAccess().getTypeArgumentsAssignment_1_1_1_1(), "rule__TypeSpecifier__TypeArgumentsAssignment_1_1_1_1");
					put(grammarAccess.getBoolLiteralAccess().getValueAssignment_1(), "rule__BoolLiteral__ValueAssignment_1");
					put(grammarAccess.getIntLiteralAccess().getValueAssignment_1(), "rule__IntLiteral__ValueAssignment_1");
					put(grammarAccess.getDoubleLiteralAccess().getValueAssignment_1(), "rule__DoubleLiteral__ValueAssignment_1");
					put(grammarAccess.getFloatLiteralAccess().getValueAssignment_1(), "rule__FloatLiteral__ValueAssignment_1");
					put(grammarAccess.getHexLiteralAccess().getValueAssignment_1(), "rule__HexLiteral__ValueAssignment_1");
					put(grammarAccess.getBinaryLiteralAccess().getValueAssignment_1(), "rule__BinaryLiteral__ValueAssignment_1");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment_1(), "rule__StringLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SolidityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SolidityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
