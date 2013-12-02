import java.awt.font.NumericShaper;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;


public class XORDecryption {
	static String[] numbers;
	static int[] numbersInt;
 	
	public static void main(String[] args){
		parseFile();
		convertNumbers();
		byte[] cipherNum = ByteBuffer.allocate(4).putInt(11).array();
		for(int i=0;i<cipherNum.length;i++){
			System.out.println(cipherNum[i]);
		}
		
	}
	
	public static void convertNumbers(){
		numbersInt = new int[numbers.length];
		for(int i=0;i<numbers.length;i++){
			Integer temp = Integer.parseInt(numbers[i]);
			int number = temp.intValue();
			numbersInt[i]=number;		
		}
	}
	
	public static void executeXOR(){
		
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
