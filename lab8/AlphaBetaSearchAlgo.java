package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AlphaBetaSearchAlgo implements ISearchAlgo {

	// function ALPHA-BETA-SEARCH(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state, Integer.MIN_VALUE , Integer.MAX_VALUE)
	// return the action in SUCCESSORS(state) with value v
	@Override
	public void execute(Node node) {
		// Enter your code here
		Stack<Node> state = new Stack<Node>();
//		List<Node> visited = new ArrayList<>();

		state.add(node);
		while (!state.isEmpty()) {
			Node temp = state.pop();
		}
	}

	// function MAX-VALUE(state, alpha, beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- MIN_VALUE;
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s, alpha, beta))
	// if v >= beta then return v
	// alpha <- MAX(alpha, v)
	// return v

	public int maxValue(Node node, int alpha, int beta) {
		// Enter your code here
		if (node.isTerminal())
			return node.getValue();
		int v = -1;
		List<Node> children = node.getChildren();
		for (Node chil : children) {
			v = Math.max(v, minValue(chil, alpha, beta));
			if (v >= beta)
				return v;
			alpha = Math.max(alpha, v);
		}
		return alpha;
	}
	// function MIN-VALUE(state, alpha , beta) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s, alpha , beta))
	// if v <= alpha then return v
	// beta <- MIN(beta ,v)
	// return v

	public int minValue(Node node, int alpha, int beta) {
		// Enter your code here
		if (node.isTerminal()) {
			return node.getValue();

		}
		int v = 1;
		List<Node> children = node.getChildren();
		for (Node chil : children) {
			v = Math.max(v, maxValue(chil, alpha, beta));
			if (v >= beta
					)
				alpha = Math.min(alpha, beta);

		}

		return 0;
	}
}
