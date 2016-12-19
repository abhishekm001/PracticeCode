package graphtraversal;

public class Node {
	
	int data;
	Boolean visited;
	Node[] adjacent;
	
	
	public Node(int data){
		this.data = data;
		this.visited = false;
	}

}
