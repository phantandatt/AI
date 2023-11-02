package lab4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class GreedyBestFirstSearchAlgo implements IInformedSearchAlgo {
      Queue<Node> frontier = new LinkedList<Node>();
      ArrayList <Node> explored = new ArrayList<Node>();
	@Override
	public Node execute(Node root, String goal) {
		frontier.add(root);
		while(!frontier.isEmpty()) {
			Node current = frontier.remove();
			System.out.println(current.getLabel());
			explored.add(current);
			if(current.getLabel().equals(goal)) {
				return current;
			}
			else {
				List<Edge> children = current.getChildren();
				for(Edge n : children) {
				
				}
			}
		}
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
