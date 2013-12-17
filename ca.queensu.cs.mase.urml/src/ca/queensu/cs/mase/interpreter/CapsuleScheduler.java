package ca.queensu.cs.mase.interpreter;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

import ca.queensu.cs.mase.interpreter.ExpressionEvaluator.NoSuchIdentifierException;
import ca.queensu.cs.mase.interpreter.OppositeFinder.ConnectorException;
import ca.queensu.cs.mase.util.TreeNode;

import com.google.common.collect.Lists;

public class CapsuleScheduler {

	/**
	 * The output stream
	 */
	private PrintStream out;

	/**
	 * The input stream
	 */
	private BufferedReader in;

	/**
	 * An enum telling us what to do when we encounter non-deterministic choice
	 * when we encounter multiple enabled transitions at the same time
	 */
	private ExecutionConfig config;

	/**
	 * Number of times to run something
	 */
	private int maxRun;

	private CapsuleScheduler() {
		// no-op
	}

	public CapsuleScheduler(BufferedReader in, PrintStream out,
			ExecutionConfig config, int maxRun) {
		this();
		this.in = in;
		this.out = out;
		this.config = config;
		this.maxRun = maxRun;
	}

	public void loopCapsuleRefs(TreeNode<CapsuleContext> capsuleContexts) {

		// loop through the capsuleCBs and run them in
		// round robin fashion.
		int capsuleIndex = 0;
		int loopNum = 0;

		try {
			List<TreeNode<CapsuleContext>> capsuleContextsList = Lists
					.newArrayList(capsuleContexts);
			int listSize = capsuleContextsList.size();
			while (true) {
				if (listSize == 0)
					break;
				TreeNode<CapsuleContext> ctxNode = capsuleContextsList
						.get(capsuleIndex);
				CapsuleContext ctx = ctxNode.data;
				if (ctx.getCapsule().getStatemachines().size() != 0) {
					new StateMachineTraverser(in, out, config)
							.executeNextState(ctx);
				}
				capsuleIndex = (capsuleIndex + 1) % listSize;
				// loopNum++;
				// if (loopNum > maxRun)
				// break;
			}
		} catch (ClassCastException | NoSuchIdentifierException
				| ConnectorException e) {
			out.println(e);
		}
	}

}
