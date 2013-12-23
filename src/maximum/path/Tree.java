package maximum.path;

import java.util.ArrayList;

public class Tree {
	
	private Node root;
	
	public Tree(Node root){
		this.root=root;
	}
	//NEED TO CHECK NEIGHBOURS LEFT NODE TO SEE IF NULL. IF NOT ADD THAT AS YOUR LEFT ONE AND THE NEW NODE AS THE RIGHT......PEEEEEEEACE
	public boolean addChild(Node node,Node theroot){		
		while(true){
			
			if(theroot.getLeft()==null && theroot.getRight()==null){//if both null
				if(theroot.getLeftNeightbor()!=null && theroot.getLeftNeightbor().getRight()!=null){//if lefts neighbor right is not null and left neighbor is not null
					theroot.setLeft(theroot.getLeftNeightbor().getRight());//set the left to the left's neighbors right
					theroot.setRight(node);//set the right to the node
					theroot.getRight().setLeftNeightbor(theroot.getLeft());
					theroot.getLeft().setRightNeighbor(theroot.getRight());
					return true;
				}
				else{
					theroot.setLeft(node);
					theroot.getLeft().setRightNeighbor(null);
					return true;
				}
			}
			else if(theroot.getLeft()!=null && theroot.getRight()==null){
				theroot.setRight(node);
				theroot.getLeft().setRightNeighbor(node);
				theroot.getRight().setLeftNeightbor(theroot.getLeft());
				return true;
			}
			else if((theroot.getLeft().getLeft()==null && theroot.getLeft().getRight()==null) || 
					(theroot.getLeft().getLeft()!=null && theroot.getLeft().getRight()==null) ||
					(theroot.getLeft().getLeft()!=null && theroot.getLeft().getLeft()!=null && theroot.getRight().getLeft()!=null && theroot.getRight().getRight()!=null)){
				addChild(node, theroot.getLeft());
				return true;
			}
			else{
				addChild(node, theroot.getRight());
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
	public boolean HasChildren(Node node){
		System.out.println(node.getLeft());
		System.out.println(node.getRight());
		if(node.getLeft()!=null && node.getRight()!=null)
			return true;
		else return false;
	}
	
	public boolean removeChild(){
		return false;
	}
	
	public void printTree(Node theroot){
		if(theroot==null)
			return;
		System.out.println(theroot);
		printTree(theroot.getLeft());
		printTree(theroot.getRight());
	}
}
