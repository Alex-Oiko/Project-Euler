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
		
		/*System.out.println(Integer.toBinaryString(65));
		System.out.println(Integer.toBinaryString(42));
		
		//System.out.println(Integer.parseInt("001011", 2));
		
		System.out.println("asdas");
		System.out.println(fillBinary(42, 65));
		System.out.println(fillBinary(65, 42));
		
		System.out.println("potatot");
		System.out.println(XOR(65, 42));
		System.out.println(Integer.parseInt(XOR(65, 42),2));*/
		System.out.println(alphabet.length);
	}
	
	
	public static String XOR(int n,int n1){
		char[] bin1C = fillBinary(n, n1).toCharArray();
		char[] bin2C= fillBinary(n1, n).toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<bin1C.length;i++){
			//System.out.println(bin1C[i]+" "+bin2C[i]);
			if(bin1C[i]=='1' && bin2C[i]=='1')
				sb.append("0");
			else if(bin1C[i]=='1' && bin2C[i]=='0')
				sb.append("1");
			else if(bin1C[i]=='0' && bin2C[i]=='1')
				sb.append("1");
			else
				sb.append("0");
		}
		return sb.toString();
	}
	
	
	public static String fillBinary(int n,int n1){
		String nBinaryString = Integer.toBinaryString(n);
		String n1BinaryString = Integer.toBinaryString(n1);
		if(nBinaryString.length()<n1BinaryString.length()){
			StringBuffer sb = new StringBuffer(nBinaryString);
			while(sb.length()<n1BinaryString.length()){
				sb.insert(0, "0");
			}
			return sb.toString();
		}
		return nBinaryString;
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
