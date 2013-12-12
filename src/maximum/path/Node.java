package maximum.path;

public class Node{
	private Integer data;
	private Pair<Node,Node> adjacents;
	private Integer depth;
	private Integer index;
	
	public Node(Integer data,Integer depth,Pair<Node,Node> adjacents,Integer index){
		this.data=data;
		this.adjacents=adjacents;
		this.depth=depth;
		this.index=index;
	}
	
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Pair<Node, Node> getAdjacents() {
		return adjacents;
	}
	public void setAdjacents(Pair<Node, Node> adjacents) {
		this.adjacents = adjacents;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	
	
}
