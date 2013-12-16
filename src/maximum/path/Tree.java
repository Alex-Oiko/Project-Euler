package maximum.path;

import java.util.ArrayList;

public class Tree {
	
	private Node root;
	
	public Tree(Node root){
		this.root=root;
	}
	
	public boolean addChild(Node node,Node theroot){		
		while(true){
			
			if(theroot.getLeft()==null && theroot.getRight()==null){
				theroot.setLeft(node);
				theroot.getLeft().setNeightbour(null); 
				return true;
			}
			else if(theroot.getLeft()!=null && theroot.getRight()==null){
				theroot.setRight(node);
				theroot.getLeft().setNeightbour(node);
				theroot.getRight().setNeightbour(theroot.getLeft());
				return true;
			}
			else if(!this.nodeHasChildren(theroot.getLeft())){
				addChild(node, theroot.getRight());
				return true;
			}
			else{
				addChild(node, theroot.getLeft());
				return true;
			}
		}
		
		
	}
	public void traverseTree(Node root){
		while(true){
			System.out.println(root.getValue());
			if(root.getLeft()==null && root.getRight()==null)
				break;
				
			traverseTree(root.getLeft());
			traverseTree(root.getRight());
			break;
		}
	}
	public boolean nodeHasChildren(Node node){
		if(node.getLeft()!=null && node.getRight()!=null)
			return true;
		else return false;
	}
	
	public boolean removeChild(){
		return false;
	}

}
