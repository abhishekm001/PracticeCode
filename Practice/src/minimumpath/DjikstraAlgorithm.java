package minimumpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class DjikstraAlgorithm {

	static HashMap<Vertex, HashSet<Edge>> graph = new HashMap<>();
	static Map<Integer, Vertex> vertices = new HashMap<Integer, Vertex>();
	private static int noOfVertices = 5;
	static Integer[] distance = new Integer[noOfVertices];
	static Vertex[] parent = new Vertex[noOfVertices];
	

	private void printGraph() {

		if (!graph.isEmpty()) {

			for (Vertex v : graph.keySet()) {

				for (Edge e : graph.get(v)) {
					System.out.println("S:" + e.sourceId.id + " D:" + e.destId.id + " W:" + e.weight);
				}
			}

		}

	}

	public static Comparator<Edge> edgeComparator = new Comparator<Edge>() {

		@Override
		public int compare(Edge arg0, Edge arg1) {
			// TODO Auto-generated method stub
			return arg0.weight - arg1.weight;
		}
	};

	
	// Complexity {(V+E)log n}
	public void djikstra(int source) {

		Vertex sv = vertices.get(source);

		Boolean[] isNodesAdded = new Boolean[noOfVertices];
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[sv.id] = 0;
		HashSet<Vertex> vertexVerified = new HashSet<>();

		PriorityQueue<Edge> pq = new PriorityQueue<>(noOfVertices - 1, edgeComparator);

		pq.add(new Edge(sv, sv, 0));

		while (vertexVerified.size() != noOfVertices) {

			Edge e = pq.poll();
			System.out.println("Polled:" + e.destId.id);
			//distance[e.destId.id] = e.weight;

			vertexVerified.add(e.destId);
			parent[e.destId.id] = e.sourceId;

			int w = e.weight;

			HashSet<Edge> neighbours = graph.get(e.destId);

			if (neighbours != null) {
				for (Edge ne : neighbours) {

					if (!vertexVerified.contains(ne.destId)) {
						if (distance[ne.destId.id] > ne.weight + w) {
							distance[ne.destId.id] = ne.weight + w;
							Edge e2 = ne.clone(ne.weight + w);
							pq.offer(e2);
						} else{
						
							pq.offer(ne);
						}
					}
				}
			}
		}

	}

	private void intialize() {

		for (int i = 0; i < noOfVertices; i++) {

			vertices.put(i, new Vertex(i));

		}

		addEdge(0, 1, 10);
		addEdge(0, 2, 500);
		addEdge(1, 2, 1);
		addEdge(1, 3, 15);
		addEdge(1, 4, 10);
		addEdge(2, 4, 3);
		

		// new DjikstraAlgorithm().printGraph();

	}

	public static void main(String[] args) {

		new DjikstraAlgorithm().intialize();
		new DjikstraAlgorithm().djikstra(0);
	//	new DjikstraAlgorithm().printGraph();
		
		for(int i : distance){
			System.out.print(i + "\t");
		}
		System.out.println();
		for(Vertex v: parent){
			if(v == null){
				System.out.print("\t");
				continue;
			}	
			System.out.print(v.id + "\t");
			
		}
	}

	private static void addEdge(int source, int dest, int weight) {

		Vertex sv = vertices.get(source);
		Vertex dv = vertices.get(dest);

		if (!graph.containsKey(sv)) {

			graph.put(sv, new HashSet<Edge>());

		}

		graph.get(sv).add(new Edge(sv, dv, weight));

	}

}
