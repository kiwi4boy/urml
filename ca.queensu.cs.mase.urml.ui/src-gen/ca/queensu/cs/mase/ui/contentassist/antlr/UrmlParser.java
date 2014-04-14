/*
* generated by Xtext
*/
package ca.queensu.cs.mase.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ca.queensu.cs.mase.services.UrmlGrammarAccess;

public class UrmlParser extends AbstractContentAssistParser {
	
	@Inject
	private UrmlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ca.queensu.cs.mase.ui.contentassist.antlr.internal.InternalUrmlParser createParser() {
		ca.queensu.cs.mase.ui.contentassist.antlr.internal.InternalUrmlParser result = new ca.queensu.cs.mase.ui.contentassist.antlr.internal.InternalUrmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_3(), "rule__Model__Alternatives_3");
					put(grammarAccess.getProtocolAccess().getAlternatives_3(), "rule__Protocol__Alternatives_3");
					put(grammarAccess.getCapsuleAccess().getAlternatives_4(), "rule__Capsule__Alternatives_4");
					put(grammarAccess.getStateMachineAccess().getAlternatives_3(), "rule__StateMachine__Alternatives_3");
					put(grammarAccess.getTransitionAccess().getAlternatives_3(), "rule__Transition__Alternatives_3");
					put(grammarAccess.getTransitionAccess().getAlternatives_8_1(), "rule__Transition__Alternatives_8_1");
					put(grammarAccess.getStatementOperationAccess().getAlternatives(), "rule__StatementOperation__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getAssignableAccess().getAlternatives(), "rule__Assignable__Alternatives");
					put(grammarAccess.getIndividualExpressionAccess().getAlternatives(), "rule__IndividualExpression__Alternatives");
					put(grammarAccess.getRelationalOpExpressionAccess().getAlternatives_1_0_0(), "rule__RelationalOpExpression__Alternatives_1_0_0");
					put(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1_0_0(), "rule__AdditiveExpression__Alternatives_1_0_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1_0_0(), "rule__MultiplicativeExpression__Alternatives_1_0_0");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getAlternatives(), "rule__UnaryExpressionNotPlusMinus__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralOrIdentifierAccess().getAlternatives(), "rule__LiteralOrIdentifier__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getIdentifiableAccess().getAlternatives(), "rule__Identifiable__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_2(), "rule__Attribute__Group_2__0");
					put(grammarAccess.getProtocolAccess().getGroup(), "rule__Protocol__Group__0");
					put(grammarAccess.getProtocolAccess().getGroup_3_0(), "rule__Protocol__Group_3_0__0");
					put(grammarAccess.getProtocolAccess().getGroup_3_1(), "rule__Protocol__Group_3_1__0");
					put(grammarAccess.getSignalAccess().getGroup(), "rule__Signal__Group__0");
					put(grammarAccess.getSignalAccess().getGroup_2(), "rule__Signal__Group_2__0");
					put(grammarAccess.getSignalAccess().getGroup_2_1(), "rule__Signal__Group_2_1__0");
					put(grammarAccess.getCapsuleAccess().getGroup(), "rule__Capsule__Group__0");
					put(grammarAccess.getCapsuleAccess().getGroup_4_0(), "rule__Capsule__Group_4_0__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_3_1(), "rule__Operation__Group_3_1__0");
					put(grammarAccess.getTimerPortAccess().getGroup(), "rule__TimerPort__Group__0");
					put(grammarAccess.getLogPortAccess().getGroup(), "rule__LogPort__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
					put(grammarAccess.getConnectorAccess().getGroup_1(), "rule__Connector__Group_1__0");
					put(grammarAccess.getConnectorAccess().getGroup_4(), "rule__Connector__Group_4__0");
					put(grammarAccess.getCapsuleInstAccess().getGroup(), "rule__CapsuleInst__Group__0");
					put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
					put(grammarAccess.getState_Access().getGroup(), "rule__State___Group__0");
					put(grammarAccess.getState_Access().getGroup_3(), "rule__State___Group_3__0");
					put(grammarAccess.getState_Access().getGroup_3_1(), "rule__State___Group_3_1__0");
					put(grammarAccess.getState_Access().getGroup_3_2(), "rule__State___Group_3_2__0");
					put(grammarAccess.getState_Access().getGroup_3_3(), "rule__State___Group_3_3__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_7(), "rule__Transition__Group_7__0");
					put(grammarAccess.getTransitionAccess().getGroup_8(), "rule__Transition__Group_8__0");
					put(grammarAccess.getTransitionAccess().getGroup_8_1_0(), "rule__Transition__Group_8_1_0__0");
					put(grammarAccess.getTransitionAccess().getGroup_8_1_0_1(), "rule__Transition__Group_8_1_0_1__0");
					put(grammarAccess.getTransitionAccess().getGroup_8_1_1(), "rule__Transition__Group_8_1_1__0");
					put(grammarAccess.getTransitionAccess().getGroup_9(), "rule__Transition__Group_9__0");
					put(grammarAccess.getTrigger_inAccess().getGroup(), "rule__Trigger_in__Group__0");
					put(grammarAccess.getTrigger_inAccess().getGroup_4(), "rule__Trigger_in__Group_4__0");
					put(grammarAccess.getTrigger_inAccess().getGroup_4_1(), "rule__Trigger_in__Group_4_1__0");
					put(grammarAccess.getTrigger_outAccess().getGroup(), "rule__Trigger_out__Group__0");
					put(grammarAccess.getTrigger_outAccess().getGroup_4(), "rule__Trigger_out__Group_4__0");
					put(grammarAccess.getTrigger_outAccess().getGroup_4_1(), "rule__Trigger_out__Group_4_1__0");
					put(grammarAccess.getWhileLoopOperationAccess().getGroup(), "rule__WhileLoopOperation__Group__0");
					put(grammarAccess.getIfStatementOperationAccess().getGroup(), "rule__IfStatementOperation__Group__0");
					put(grammarAccess.getIfStatementOperationAccess().getGroup_5(), "rule__IfStatementOperation__Group_5__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_2(), "rule__Variable__Group_2__0");
					put(grammarAccess.getSendTriggerAccess().getGroup(), "rule__SendTrigger__Group__0");
					put(grammarAccess.getSendTriggerAccess().getGroup_2(), "rule__SendTrigger__Group_2__0");
					put(grammarAccess.getInformTimerAccess().getGroup(), "rule__InformTimer__Group__0");
					put(grammarAccess.getNoOpAccess().getGroup(), "rule__NoOp__Group__0");
					put(grammarAccess.getInvokeAccess().getGroup(), "rule__Invoke__Group__0");
					put(grammarAccess.getInvokeAccess().getGroup_3(), "rule__Invoke__Group_3__0");
					put(grammarAccess.getInvokeAccess().getGroup_3_1(), "rule__Invoke__Group_3_1__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_5(), "rule__IfStatement__Group_5__0");
					put(grammarAccess.getLogStatementAccess().getGroup(), "rule__LogStatement__Group__0");
					put(grammarAccess.getStringExpressionAccess().getGroup(), "rule__StringExpression__Group__0");
					put(grammarAccess.getStringExpressionAccess().getGroup_1(), "rule__StringExpression__Group_1__0");
					put(grammarAccess.getStringExpressionAccess().getGroup_1_0(), "rule__StringExpression__Group_1_0__0");
					put(grammarAccess.getConditionalOrExpressionAccess().getGroup(), "rule__ConditionalOrExpression__Group__0");
					put(grammarAccess.getConditionalOrExpressionAccess().getGroup_1(), "rule__ConditionalOrExpression__Group_1__0");
					put(grammarAccess.getConditionalOrExpressionAccess().getGroup_1_0(), "rule__ConditionalOrExpression__Group_1_0__0");
					put(grammarAccess.getConditionalAndExpressionAccess().getGroup(), "rule__ConditionalAndExpression__Group__0");
					put(grammarAccess.getConditionalAndExpressionAccess().getGroup_1(), "rule__ConditionalAndExpression__Group_1__0");
					put(grammarAccess.getConditionalAndExpressionAccess().getGroup_1_0(), "rule__ConditionalAndExpression__Group_1_0__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup(), "rule__RelationalOpExpression__Group__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1(), "rule__RelationalOpExpression__Group_1__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0(), "rule__RelationalOpExpression__Group_1_0__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_0(), "rule__RelationalOpExpression__Group_1_0_0_0__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_1(), "rule__RelationalOpExpression__Group_1_0_0_1__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_2(), "rule__RelationalOpExpression__Group_1_0_0_2__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_3(), "rule__RelationalOpExpression__Group_1_0_0_3__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_4(), "rule__RelationalOpExpression__Group_1_0_0_4__0");
					put(grammarAccess.getRelationalOpExpressionAccess().getGroup_1_0_0_5(), "rule__RelationalOpExpression__Group_1_0_0_5__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0(), "rule__AdditiveExpression__Group_1_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0_0(), "rule__AdditiveExpression__Group_1_0_0_0__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0_0_1(), "rule__AdditiveExpression__Group_1_0_0_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0(), "rule__MultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0_0(), "rule__MultiplicativeExpression__Group_1_0_0_0__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0_1(), "rule__MultiplicativeExpression__Group_1_0_0_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0_0_2(), "rule__MultiplicativeExpression__Group_1_0_0_2__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getNotBooleanExpressionAccess().getGroup(), "rule__NotBooleanExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getIntLiteralAccess().getGroup(), "rule__IntLiteral__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
					put(grammarAccess.getFunctionCallAccess().getGroup_3_1(), "rule__FunctionCall__Group_3_1__0");
					put(grammarAccess.getBoolLiteralAccess().getGroup(), "rule__BoolLiteral__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getCapsulesAssignment_3_0(), "rule__Model__CapsulesAssignment_3_0");
					put(grammarAccess.getModelAccess().getProtocolsAssignment_3_1(), "rule__Model__ProtocolsAssignment_3_1");
					put(grammarAccess.getLocalVarAccess().getNameAssignment(), "rule__LocalVar__NameAssignment");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getDefaultValueAssignment_2_1(), "rule__Attribute__DefaultValueAssignment_2_1");
					put(grammarAccess.getProtocolAccess().getNameAssignment_1(), "rule__Protocol__NameAssignment_1");
					put(grammarAccess.getProtocolAccess().getIncomingMessagesAssignment_3_0_2(), "rule__Protocol__IncomingMessagesAssignment_3_0_2");
					put(grammarAccess.getProtocolAccess().getOutgoingMessagesAssignment_3_1_2(), "rule__Protocol__OutgoingMessagesAssignment_3_1_2");
					put(grammarAccess.getSignalAccess().getNameAssignment_0(), "rule__Signal__NameAssignment_0");
					put(grammarAccess.getSignalAccess().getLocalVarsAssignment_2_0(), "rule__Signal__LocalVarsAssignment_2_0");
					put(grammarAccess.getSignalAccess().getLocalVarsAssignment_2_1_1(), "rule__Signal__LocalVarsAssignment_2_1_1");
					put(grammarAccess.getCapsuleAccess().getRootAssignment_0(), "rule__Capsule__RootAssignment_0");
					put(grammarAccess.getCapsuleAccess().getNameAssignment_2(), "rule__Capsule__NameAssignment_2");
					put(grammarAccess.getCapsuleAccess().getInterfacePortsAssignment_4_0_1(), "rule__Capsule__InterfacePortsAssignment_4_0_1");
					put(grammarAccess.getCapsuleAccess().getInternalPortsAssignment_4_1(), "rule__Capsule__InternalPortsAssignment_4_1");
					put(grammarAccess.getCapsuleAccess().getTimerPortsAssignment_4_2(), "rule__Capsule__TimerPortsAssignment_4_2");
					put(grammarAccess.getCapsuleAccess().getLogPortsAssignment_4_3(), "rule__Capsule__LogPortsAssignment_4_3");
					put(grammarAccess.getCapsuleAccess().getAttributesAssignment_4_4(), "rule__Capsule__AttributesAssignment_4_4");
					put(grammarAccess.getCapsuleAccess().getCapsuleInstsAssignment_4_5(), "rule__Capsule__CapsuleInstsAssignment_4_5");
					put(grammarAccess.getCapsuleAccess().getConnectorsAssignment_4_6(), "rule__Capsule__ConnectorsAssignment_4_6");
					put(grammarAccess.getCapsuleAccess().getOperationsAssignment_4_7(), "rule__Capsule__OperationsAssignment_4_7");
					put(grammarAccess.getCapsuleAccess().getStatemachinesAssignment_4_8(), "rule__Capsule__StatemachinesAssignment_4_8");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getLocalVarsAssignment_3_0(), "rule__Operation__LocalVarsAssignment_3_0");
					put(grammarAccess.getOperationAccess().getLocalVarsAssignment_3_1_1(), "rule__Operation__LocalVarsAssignment_3_1_1");
					put(grammarAccess.getOperationAccess().getOperationCodeAssignment_6(), "rule__Operation__OperationCodeAssignment_6");
					put(grammarAccess.getTimerPortAccess().getNameAssignment_1(), "rule__TimerPort__NameAssignment_1");
					put(grammarAccess.getLogPortAccess().getNameAssignment_1(), "rule__LogPort__NameAssignment_1");
					put(grammarAccess.getPortAccess().getConjugatedAssignment_1(), "rule__Port__ConjugatedAssignment_1");
					put(grammarAccess.getPortAccess().getNameAssignment_2(), "rule__Port__NameAssignment_2");
					put(grammarAccess.getPortAccess().getProtocolAssignment_4(), "rule__Port__ProtocolAssignment_4");
					put(grammarAccess.getConnectorAccess().getCapsuleInst1Assignment_1_0(), "rule__Connector__CapsuleInst1Assignment_1_0");
					put(grammarAccess.getConnectorAccess().getPort1Assignment_2(), "rule__Connector__Port1Assignment_2");
					put(grammarAccess.getConnectorAccess().getCapsuleInst2Assignment_4_0(), "rule__Connector__CapsuleInst2Assignment_4_0");
					put(grammarAccess.getConnectorAccess().getPort2Assignment_5(), "rule__Connector__Port2Assignment_5");
					put(grammarAccess.getCapsuleInstAccess().getNameAssignment_1(), "rule__CapsuleInst__NameAssignment_1");
					put(grammarAccess.getCapsuleInstAccess().getTypeAssignment_3(), "rule__CapsuleInst__TypeAssignment_3");
					put(grammarAccess.getStateMachineAccess().getStatesAssignment_3_0(), "rule__StateMachine__StatesAssignment_3_0");
					put(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1(), "rule__StateMachine__TransitionsAssignment_3_1");
					put(grammarAccess.getState_Access().getFinalAssignment_0(), "rule__State___FinalAssignment_0");
					put(grammarAccess.getState_Access().getNameAssignment_2(), "rule__State___NameAssignment_2");
					put(grammarAccess.getState_Access().getEntryCodeAssignment_3_1_2(), "rule__State___EntryCodeAssignment_3_1_2");
					put(grammarAccess.getState_Access().getExitCodeAssignment_3_2_2(), "rule__State___ExitCodeAssignment_3_2_2");
					put(grammarAccess.getState_Access().getSubstatemachineAssignment_3_3_1(), "rule__State___SubstatemachineAssignment_3_3_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getInitAssignment_3_0(), "rule__Transition__InitAssignment_3_0");
					put(grammarAccess.getTransitionAccess().getFromAssignment_3_1(), "rule__Transition__FromAssignment_3_1");
					put(grammarAccess.getTransitionAccess().getToAssignment_5(), "rule__Transition__ToAssignment_5");
					put(grammarAccess.getTransitionAccess().getGuardAssignment_7_2(), "rule__Transition__GuardAssignment_7_2");
					put(grammarAccess.getTransitionAccess().getTriggersAssignment_8_1_0_0(), "rule__Transition__TriggersAssignment_8_1_0_0");
					put(grammarAccess.getTransitionAccess().getTriggersAssignment_8_1_0_1_1(), "rule__Transition__TriggersAssignment_8_1_0_1_1");
					put(grammarAccess.getTransitionAccess().getTimerPortAssignment_8_1_1_1(), "rule__Transition__TimerPortAssignment_8_1_1_1");
					put(grammarAccess.getTransitionAccess().getActionAssignment_9_2(), "rule__Transition__ActionAssignment_9_2");
					put(grammarAccess.getTrigger_inAccess().getFromAssignment_0(), "rule__Trigger_in__FromAssignment_0");
					put(grammarAccess.getTrigger_inAccess().getSignalAssignment_2(), "rule__Trigger_in__SignalAssignment_2");
					put(grammarAccess.getTrigger_inAccess().getParametersAssignment_4_0(), "rule__Trigger_in__ParametersAssignment_4_0");
					put(grammarAccess.getTrigger_inAccess().getParametersAssignment_4_1_1(), "rule__Trigger_in__ParametersAssignment_4_1_1");
					put(grammarAccess.getIncomingVariableAccess().getNameAssignment(), "rule__IncomingVariable__NameAssignment");
					put(grammarAccess.getTrigger_outAccess().getToAssignment_0(), "rule__Trigger_out__ToAssignment_0");
					put(grammarAccess.getTrigger_outAccess().getSignalAssignment_2(), "rule__Trigger_out__SignalAssignment_2");
					put(grammarAccess.getTrigger_outAccess().getParametersAssignment_4_0(), "rule__Trigger_out__ParametersAssignment_4_0");
					put(grammarAccess.getTrigger_outAccess().getParametersAssignment_4_1_1(), "rule__Trigger_out__ParametersAssignment_4_1_1");
					put(grammarAccess.getOperationCodeAccess().getStatementsAssignment(), "rule__OperationCode__StatementsAssignment");
					put(grammarAccess.getWhileLoopOperationAccess().getConditionAssignment_1(), "rule__WhileLoopOperation__ConditionAssignment_1");
					put(grammarAccess.getWhileLoopOperationAccess().getStatementsAssignment_3(), "rule__WhileLoopOperation__StatementsAssignment_3");
					put(grammarAccess.getIfStatementOperationAccess().getConditionAssignment_1(), "rule__IfStatementOperation__ConditionAssignment_1");
					put(grammarAccess.getIfStatementOperationAccess().getThenStatementsAssignment_3(), "rule__IfStatementOperation__ThenStatementsAssignment_3");
					put(grammarAccess.getIfStatementOperationAccess().getElseStatementsAssignment_5_2(), "rule__IfStatementOperation__ElseStatementsAssignment_5_2");
					put(grammarAccess.getReturnStatementAccess().getReturnValueAssignment_2(), "rule__ReturnStatement__ReturnValueAssignment_2");
					put(grammarAccess.getActionCodeAccess().getStatementsAssignment(), "rule__ActionCode__StatementsAssignment");
					put(grammarAccess.getVariableAccess().getVarAssignment_1(), "rule__Variable__VarAssignment_1");
					put(grammarAccess.getVariableAccess().getAssignAssignment_2_0(), "rule__Variable__AssignAssignment_2_0");
					put(grammarAccess.getVariableAccess().getExpAssignment_2_1(), "rule__Variable__ExpAssignment_2_1");
					put(grammarAccess.getSendTriggerAccess().getTriggersAssignment_1(), "rule__SendTrigger__TriggersAssignment_1");
					put(grammarAccess.getSendTriggerAccess().getTriggersAssignment_2_1(), "rule__SendTrigger__TriggersAssignment_2_1");
					put(grammarAccess.getInformTimerAccess().getTimerPortAssignment_1(), "rule__InformTimer__TimerPortAssignment_1");
					put(grammarAccess.getInformTimerAccess().getTimeAssignment_3(), "rule__InformTimer__TimeAssignment_3");
					put(grammarAccess.getInvokeAccess().getOperationAssignment_1(), "rule__Invoke__OperationAssignment_1");
					put(grammarAccess.getInvokeAccess().getParametersAssignment_3_0(), "rule__Invoke__ParametersAssignment_3_0");
					put(grammarAccess.getInvokeAccess().getParametersAssignment_3_1_1(), "rule__Invoke__ParametersAssignment_3_1_1");
					put(grammarAccess.getAssignmentAccess().getLvalueAssignment_0(), "rule__Assignment__LvalueAssignment_0");
					put(grammarAccess.getAssignmentAccess().getExpAssignment_2(), "rule__Assignment__ExpAssignment_2");
					put(grammarAccess.getWhileLoopAccess().getConditionAssignment_1(), "rule__WhileLoop__ConditionAssignment_1");
					put(grammarAccess.getWhileLoopAccess().getStatementsAssignment_3(), "rule__WhileLoop__StatementsAssignment_3");
					put(grammarAccess.getIfStatementAccess().getConditionAssignment_1(), "rule__IfStatement__ConditionAssignment_1");
					put(grammarAccess.getIfStatementAccess().getThenStatementsAssignment_3(), "rule__IfStatement__ThenStatementsAssignment_3");
					put(grammarAccess.getIfStatementAccess().getElseStatementsAssignment_5_2(), "rule__IfStatement__ElseStatementsAssignment_5_2");
					put(grammarAccess.getLogStatementAccess().getLogPortAssignment_1(), "rule__LogStatement__LogPortAssignment_1");
					put(grammarAccess.getLogStatementAccess().getLeftAssignment_3(), "rule__LogStatement__LeftAssignment_3");
					put(grammarAccess.getStringExpressionAccess().getRestAssignment_1_0_2(), "rule__StringExpression__RestAssignment_1_0_2");
					put(grammarAccess.getIndividualExpressionAccess().getExprAssignment_0(), "rule__IndividualExpression__ExprAssignment_0");
					put(grammarAccess.getIndividualExpressionAccess().getStrAssignment_1(), "rule__IndividualExpression__StrAssignment_1");
					put(grammarAccess.getConditionalOrExpressionAccess().getRestAssignment_1_0_2(), "rule__ConditionalOrExpression__RestAssignment_1_0_2");
					put(grammarAccess.getConditionalAndExpressionAccess().getRestAssignment_1_0_2(), "rule__ConditionalAndExpression__RestAssignment_1_0_2");
					put(grammarAccess.getRelationalOpExpressionAccess().getRestAssignment_1_1(), "rule__RelationalOpExpression__RestAssignment_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRestAssignment_1_1(), "rule__AdditiveExpression__RestAssignment_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRestAssignment_1_1(), "rule__MultiplicativeExpression__RestAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getExpAssignment_1_2(), "rule__UnaryExpression__ExpAssignment_1_2");
					put(grammarAccess.getNotBooleanExpressionAccess().getExpAssignment_1(), "rule__NotBooleanExpression__ExpAssignment_1");
					put(grammarAccess.getIntLiteralAccess().getIntAssignment_1(), "rule__IntLiteral__IntAssignment_1");
					put(grammarAccess.getIdentifierAccess().getIdAssignment(), "rule__Identifier__IdAssignment");
					put(grammarAccess.getFunctionCallAccess().getCallAssignment_1(), "rule__FunctionCall__CallAssignment_1");
					put(grammarAccess.getFunctionCallAccess().getParamsAssignment_3_0(), "rule__FunctionCall__ParamsAssignment_3_0");
					put(grammarAccess.getFunctionCallAccess().getParamsAssignment_3_1_1(), "rule__FunctionCall__ParamsAssignment_3_1_1");
					put(grammarAccess.getBoolLiteralAccess().getTrueAssignment_1(), "rule__BoolLiteral__TrueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ca.queensu.cs.mase.ui.contentassist.antlr.internal.InternalUrmlParser typedParser = (ca.queensu.cs.mase.ui.contentassist.antlr.internal.InternalUrmlParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public UrmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(UrmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
