package maximum.path;

import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

public class MaximumPathSum {
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException{
		readFile();
		/*for(Integer num:nums){
			System.out.println(num);
		}*/
		Node theroot = new Node(75);
		Tree tree = new Tree(theroot);
		tree.addChild(new Node(95), theroot);
		tree.addChild(new Node(64), theroot);
		tree.addChild(new Node(17), theroot);
		tree.addChild(new Node(47), theroot);
		tree.addChild(new Node(82), theroot);
		tree.addChild(new Node(18), theroot);
		tree.addChild(new Node(35), theroot);
		tree.addChild(new Node(87), theroot);
		tree.addChild(new Node(10), theroot);
		
		tree.printTree(theroot);

	}
	
	public static void addTwoTimes(Tree tree,Node root,Node addition){
		tree.addChild(addition, root);
		tree.addChild(addition, root);
	}
	
	public static void readFile() throws IOException{
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("./maximum_path"));	
			String sCurrentLine;
			int depth=1;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				sCurrentLine = sCurrentLine.replaceAll("\\s+", "");
				String[] splits = sCurrentLine.split(",");
				for(String num:splits){
					nums.add(Integer.parseInt(num));
				}
				depth++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
