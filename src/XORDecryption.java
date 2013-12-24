import java.awt.font.NumericShaper;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

import javax.swing.Box.Filler;


/**TODO: Need to find all permutations of the alphabet...mb use recursion?. Then need to search with basic words in the english dictionary
 * @author aoikonomou
 *
 */
public class XORDecryption {
	static String[] numbers;
	static int[] numbersInt;
 	static char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m',
 							'n','o','p','q','r','s','t','v','u','w','x','y','z',};
	
	public static void main(String[] args){
		parseFile();
		System.out.println(65^42);
		//System.out.println(Integer.parseInt(XOR(65, 42),2));
		//System.out.println(alphabet.length);
	}
	public static void permuteAlphabet(){
		char[] arr=new char[3];
		for(int i=0;i<alphabet.length;i++){
			for(int f=0;f<3;f++){
				arr[f]=alphabet[i];
			}
		}	
	}
	
	public static void decryptSentence(){
		
	}
	
	
	public static void parseFile(){
		try{
		BufferedReader br = new BufferedReader(new FileReader("cipher1.txt"));
		
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			numbers=sCurrentLine.split(",");
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
}
