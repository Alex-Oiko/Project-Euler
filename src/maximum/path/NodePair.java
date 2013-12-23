package maximum.path;

public class NodePair {
	private Node left;
	private Node right;
	
	public NodePair(Node left,Node right){
		this.left=left;
		this.right=right;
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
	

}
