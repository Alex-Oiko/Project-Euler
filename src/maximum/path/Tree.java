package maximum.path;

import java.util.ArrayList;
import java.util.HashMap;

public class Tree {
	
	private Node root;
	HashMap<Integer,ArrayList<Integer>> children;
	HashMap<Integer,ArrayList<Node>> childrenNodes;
	
	
	public Tree(Node root){
		this.root=root;
	}	
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	public HashMap<Integer, ArrayList<Integer>> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Integer, ArrayList<Integer>> children) {
		this.children = children;
	}
	public Node getNode(Integer depth,int index){
		return childrenNodes.get(depth).get(index); 
	}

	public HashMap<Integer, ArrayList<Node>> getChildrenNodes() {
		return childrenNodes;
	}

	public void setChildrenNodes(HashMap<Integer, ArrayList<Node>> childrenNodes) {
		this.childrenNodes = childrenNodes;
	}
	
	
}
