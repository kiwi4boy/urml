/*
 * generated by Xtext
 */
package ca.queensu.cs.mase.scoping;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import ca.queensu.cs.mase.urml.Connector;
import ca.queensu.cs.mase.urml.Capsule;
import ca.queensu.cs.mase.urml.Port;
import ca.queensu.cs.mase.urml.State_;
import ca.queensu.cs.mase.urml.Trigger_in;
import ca.queensu.cs.mase.urml.Trigger_out;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class UrmlScopeProvider extends AbstractDeclarativeScopeProvider {
	public IScope scope_Connector_port1(Connector cntr, EReference ref) {
		return Scopes.scopeFor(cntr.getCapsuleInst1().getType().getInterfacePorts());
	}
	
	public IScope scope_Connector_port2(Connector cntr, EReference ref) {
		EList<Port> list = cntr.getCapsuleInst2().getType().getInterfacePorts();
		IScope scope = Scopes.scopeFor(list);
		return scope;
	}	
	
	public IScope scope_Trigger_out_signal(Trigger_out t, EReference ref) {		
		Port from = t.getTo();
		if (!from.isConjugated())  
			// port has base gender
			return Scopes.scopeFor(from.getProtocol().getOutgoingMessages());
		else 
			// port has conjugated gender
			return Scopes.scopeFor(from.getProtocol().getIncomingMessages());
	}
	
	public IScope scope_Trigger_in_signal(Trigger_in t, EReference ref) {		
		Port from = t.getFrom();
		if (!from.isConjugated())  
			// port has base gender
			return Scopes.scopeFor(from.getProtocol().getIncomingMessages());
		else 
			// port has conjugated gender
			return Scopes.scopeFor(from.getProtocol().getOutgoingMessages());
	}
	
//	public IScope scope_EntryPointTarget_trPoint(EntryPointTarget t, 
//			EReference ref) {
//		return Scopes.scopeFor(t.getState().getSubstatemachine().getPoints());
//	}
	
	private IScope scope_Transition(Capsule c, EReference ref) {
		List<State_> list = EcoreUtil2.getAllContentsOfType(c, State_.class);
		IScope scope = Scopes.scopeFor(list);
		return scope;		
	}
	
	public IScope scope_Transition_to(Capsule c, EReference ref) {
		return scope_Transition(c, ref);
	}
	
	public IScope scope_Transition_from(Capsule c, EReference ref) {
		return scope_Transition(c, ref);
	}

}
