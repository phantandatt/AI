package lab4;

import java.util.List;
import java.util.PriorityQueue;

public class AStarSearchAlgo implements IInformedSearchAlgo{

	@Override
	public Node execute(Node root, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>();
		return null;
	}

	@Override
	public Node execute(Node root, String start, String goal) {
		PriorityQueue<Node> frontier = new PriorityQueue<Node>();
		frontier.add(root);
		while (!frontier.isEmpty()) {
			Node current= frontier.remove();
			if (current.getLabel().equals(goal)) {
				return current;
			}
			List<Edge> children = current.getChildren();
			for (Edge e : children) {
				Node chil = e.getEnd();
				if (!frontier.contains(chil)) {
					double g = current.getG()+ e.getWeight();
					chil.setG(g);
					chil.setParent(current);
					frontier.add(chil);
					
					}
			}
			return root;
		}
		return null;
	}

}
