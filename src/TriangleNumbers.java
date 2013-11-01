import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class TriangleNumbers {
	
	public static boolean isTriangle(int n){//if double is not exactly the int---- then false
		double triangle = (-1+Math.sqrt(8*n+1))/2;
		return triangle==(int)triangle;
	}
	
	public static String readFile() throws IOException{
		String line = "",currentLine;
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new FileReader("words.txt"));
		
		while((currentLine=br.readLine())!=null){
			System.out.println(currentLine);
			sb.append(currentLine);
		}
		line=sb.toString();
		System.out.println("String reading here");
		//System.out.println(line);
		return line;
	}
	
	public static HashMap<String,Integer> initialiseParser(){
		HashMap<String,Integer> parser = new HashMap<String, Integer>();
		
		parser.put("A", 1);
		parser.put("B", 2);
		parser.put("C", 3);
		parser.put("D", 4);
		parser.put("E", 5);
		parser.put("F", 6);
		parser.put("G", 7);
		parser.put("H", 8);
		parser.put("I", 9);
		parser.put("J", 10);
		parser.put("K", 11);
		parser.put("L", 12);
		parser.put("M", 13);
		parser.put("N", 14);
		parser.put("O", 15);
		parser.put("P", 16);
		parser.put("Q", 17);
		parser.put("R", 18);
		parser.put("S", 19);
		parser.put("T", 20);
		parser.put("U", 21);
		parser.put("V", 22);
		parser.put("W", 23);
		parser.put("X", 24);
		parser.put("Y", 25);
		parser.put("Z", 26);
		
		return parser;
	}

	
	public static ArrayList<String> parseDocument(String document){
		ArrayList<String> wordsspl = new ArrayList<String>();
		String words[]=document.split(",");
		for(String word:words){
			wordsspl.add(word.substring(1, word.length()-1));
		}
		return wordsspl;
	}
	public static int wordValue(String word,HashMap<String,Integer> parser){
		int sum=0;
		
		char[] worda = word.toCharArray();
		for(Character cha:worda){
			sum+=parser.get(cha.toString());
		}
		return sum;
	}
	
	public static void main(String[] args){
		String document=null;
		int triangleWords=0;
		HashMap<String,Integer> parser = initialiseParser();
		try {
			 document = readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> words = parseDocument(document);
		System.out.println(wordValue("SKY", parser));
		System.out.println(isTriangle(wordValue("SKY", parser)));
		for(String word:words){
			if(isTriangle(wordValue(word, parser))){
				triangleWords++;
			}
		}
		
		System.out.println("The amount of triangle words are:"+triangleWords);
	}
}
