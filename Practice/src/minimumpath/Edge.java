package minimumpath;

public class Edge {
	
	Vertex sourceId;
	Vertex destId;
	
	int weight;
	
	
	public Edge(Vertex sid, Vertex did, int data ){
		this.sourceId = sid;
		this.destId = did;
		this.weight = data;
	}
	
	public Edge clone(int weight){
		
		Edge edge = new Edge(sourceId, destId, weight);
		
		return edge;
	}

}
