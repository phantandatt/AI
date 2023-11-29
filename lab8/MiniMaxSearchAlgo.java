package lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MiniMaxSearchAlgo implements ISearchAlgo {

	// function MINIMAX-DECISION(state) returns an action
	// inputs: state, current state in game
	// v <- MAX-VALUE(state)
	// return the action in SUCCESSORS(state) with value v
	@Override
	public void execute(Node node) {
		// Enter your code here
		Stack<Node> state = new Stack<Node>();
		List<Node> visited = new ArrayList<>();

		state.add(node);
		while (!state.isEmpty()) {
			Node temp = state.pop();
		}
		int v = maxValue(node);

	}

	// function MAX-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MIN_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MAX(v, MIN-VALUE(s))
	// return v
	public int maxValue(Node node) {
		if (node.isTerminal())
			return node.getValue();
		int v = Integer.MIN_VALUE;
		for (Node n : node.getChildren()) {
			int tmp = minValue(n);
			if (v < tmp) {
				v = tmp;
//				node.setBestMove(n);
			}
		}
		return v;
	}
	// function MIN-VALUE(state) returns a utility value
	// if TERMINAL-TEST(state) then return UTILITY(state)
	// v <- Integer.MAX_VALUE
	// for each s in SUCCESSORS(state) do
	// v <- MIN(v, MAX-VALUE(s))
	// return v

	public int minValue(Node node) {
		// Enter your code here
		if (node.isTerminal())
			return node.getValue();

		int v = Integer.MAX_VALUE;
		for (Node n : node.getChildren()) {

			int temp = maxValue(n);
			if (v > temp) {
				v = temp;
			}
		}
		return v;
	}
   
}
