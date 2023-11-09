package student;

import java.util.Arrays;
import java.util.List;

public class TestNode {

	public static void main(String[] args) {
		Puzzle p = new Puzzle();
		p.readInput("txt/PuzzleMap.txt", "txt/PuzzleGoalState.txt");
		
		AStarAlgo algo= new AStarAlgo();
		
		Node initialState = p.getInitialState();
		System.out.println(initialState);
		
		Node res=algo.execute(p);
		System.out.println("A*:");
		System.out.println(res.getG());
		System.out.println(res);
		
		GreedyBestFirstSearchAlgo algo2= new GreedyBestFirstSearchAlgo();
		System.out.println("Tham lam:");
		Node res2=algo2.execute(p);
		System.out.println(res2.getG());
		System.out.println(res2);
		 

//		Node tmp = new Node(initialState);
//		System.out.println(initialState.equals(tmp));
////		Node goalState = p.getGoalState();
////		System.out.println(p.getInitialState());
//		System.out.println("H: "+initialState.getH());
////		System.out.println(Arrays.toString(initialState.getWhiteTilePosition()));
////		System.out.println(p.getGoalState());
//		Node re = p.moveWhiteTile(initialState, 'r');
//
//		System.out.println(re);
//		System.out.println(re.getH());
//		System.out.println(initialState);
////		System.out.println(Arrays.toString(re.getWhiteTilePosition()));		
////		System.out.println(p.computeH(init, goal));
//
//		 System.out.println(p.getInitialState());
//		 System.out.println(p.getGoalState());
//		
//		 List<Node> children = p.getSuccessors(initialState);
//		 System.out.println("Size: "+children.size());
//		 for (Node child : children) {
////		 System.out.println(child.getH()+" "+p.computeH(child) );
//		 }
	}
}
