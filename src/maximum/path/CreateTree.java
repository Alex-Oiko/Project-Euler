package maximum.path;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class CreateTree {
	
	public Tree readFile(){
		BufferedReader br = null;
		Tree tree = null;
		Pair pair = null;
		tree.children = new HashMap<Integer,ArrayList<Integer>>();
		tree.childrenNodes = new HashMap<Integer,ArrayList<Node>>();
		
		try{
		br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/aoikonomou/Documents/GitHub/Project-Euler/src/maximum/path/maximum_path")));
		
		String sCurrentLine;
		String[] breakLine;
		Integer depthCounter = 0;

		while ((sCurrentLine = br.readLine()) != null) {
			breakLine = sCurrentLine.split(",");
			if(breakLine.length==1){//initialise tree with the root node
				Node root = new Node(Integer.parseInt(breakLine[0]),0,pair,0);
				tree = new Tree(root);
				ArrayList<Integer> values =  new ArrayList<Integer>();
				ArrayList<Node> rootNodearr = new ArrayList<Node>();
				values.add(Integer.parseInt(breakLine[0]));
				rootNodearr.add(root);
				tree.childrenNodes.put(0,rootNodearr);
				tree.children.put(new Integer(0), values);
			}
			else{
				ArrayList<Integer> values = new ArrayList<Integer>();
				for(int i=0;i<breakLine.length;i++){
					if(i+1>breakLine.length)
						break;
					//pair = new Pair(new Node(Integer.parseInt(breakLine[i]),
						//	new Node(Integer.parseInt(breakLine[i+1])));
					tree.getNode(depthCounter, i).setAdjacents(pair);
					values.add(Integer.parseInt(breakLine[i]));
				}
				tree.children.put(depthCounter, values);
			}
			depthCounter++;
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
		return null;
	}

}
