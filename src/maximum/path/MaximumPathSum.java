package maximum.path;

import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

public class MaximumPathSum {
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void main(String[] args){
		/*Node root = new Node(2);
		Tree tree = new Tree(root);
		
		tree.addChild(new Node(3), root);
		tree.addChild(new Node(2), root);
		tree.addChild(new Node(4), root);
		tree.addChild(new Node(5), root);
		tree.addChild(new Node(6), root);
		tree.addChild(new Node(7), root);
		
		tree.traverseTree(root);*/
		try {
			readFile();
			
			for(Integer num:nums){
				System.out.println(num);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFile() throws IOException{
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader("./maximum_path"));	
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				sCurrentLine = sCurrentLine.replaceAll("\\s+", "");
				String[] splits = sCurrentLine.split(",");
				for(String num:splits){
					nums.add(Integer.parseInt(num));
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
