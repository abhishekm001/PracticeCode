package graphtraversal;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

	public void bfs(Node root) {

		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<Node>();

		queue.offer(root);

		while (!queue.isEmpty()) {

			Node node = queue.poll();
			visit(node);

			if (node.adjacent != null) {
				for (Node adj : node.adjacent) {
					
					queue.offer(adj);
				}
			}
		}

	}

	private void visit(Node node) {
		System.out.println(node.data);
		node.visited = true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		Node node6 = new Node(60);

		node1.adjacent = new Node[2];
		node1.adjacent[0] = node2;
		node1.adjacent[1] = node3;

		node2.adjacent = new Node[2];
		node2.adjacent[0] = node5;
		node2.adjacent[1] = node4;

		node3.adjacent = new Node[1];
		node3.adjacent[0] = node6;

		new BFSTraversal().bfs(node1);


	}

}
