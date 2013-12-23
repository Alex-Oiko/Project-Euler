package maximum.path;

public class Node {
	
	private int value;
	private Node left;
	private Node right;
	private Node leftNeightbor;
	private Node rightNeighbor;

	public Node(int value){
		this.value=value;
	}
	

	public Node getLeftNeightbor() {
		return leftNeightbor;
	}



	public void setLeftNeightbor(Node leftNeightbor) {
		this.leftNeightbor = leftNeightbor;
	}



	public Node getRightNeighbor() {
		return rightNeighbor;
	}



	public void setRightNeighbor(Node rightNeighbor) {
		this.rightNeighbor = rightNeighbor;
	}



	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public String toString(){
		return "Node:"+
				"Value " +(this.value==0 ? "null": this.value)+",	"+
				"Left " +(this.left==null ? "null": this.left.value)+",	"+
				"Right " +(this.right==null ? "null":this.right.value)+",	"+
				"Right_Neighbour " +(this.rightNeighbor==null? "null" : this.rightNeighbor.value)+",	"+
				"Left_Neighbour "+(this.leftNeightbor==null ? "null" : this .leftNeightbor.value);		
	}
}
