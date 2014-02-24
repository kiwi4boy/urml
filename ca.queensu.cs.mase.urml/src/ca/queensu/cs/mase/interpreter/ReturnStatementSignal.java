package ca.queensu.cs.mase.interpreter;

/**
 * A dirty (really dirty) trick. When we have met a "return" statement from the
 * action code, throw this exception so that we can break the "while" loops and
 * "if" statements without using some stored flags
 * 
 * @author Keith
 * 
 */
public class ReturnStatementSignal extends RuntimeException {
	private static final long serialVersionUID = 1719831731643766253L;
}