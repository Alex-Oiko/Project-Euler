import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;


/**TODO: Need to find all permutations of the alphabet...mb use recursion?. Then need to search with basic words in the english dictionary
 * @author aoikonomou
 *
 */
public class XORDecryption {
	static String[] numbers;
	static int[] numbersInt;
 	static Character[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m',
 							'n','o','p','q','r','s','t','v','u','w','x','y','z',};
	
	public static void main(String[] args){
		parseFile();
		//System.out.println(65^42);
		/*ArrayBlockingQueue<Integer> currentPermutation = new ArrayBlockingQueue<Integer>(3);
		try {
			currentPermutation.put(101);
			currentPermutation.put(102);
			currentPermutation.put(103);
			System.out.println(decrypt(currentPermutation));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("TESTTTTTTTTTTTTTTTTTTT");
		System.out.println(79^101);
		System.out.println(59^102);
		System.out.println(12^103);
		System.out.println(2^101);*/
		//System.out.println(79^101);
		

		try {
			decryptSentence();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void permuteAlphabet(){
		char[] arr=new char[3];
		for(int i=0;i<alphabet.length;i++){
			for(int f=0;f<3;f++){
				arr[f]=alphabet[i];
			}
		}	
	}
	
	public static void decryptSentence() throws InterruptedException, FileNotFoundException{
		ICombinatoricsVector<Character> initialVector = Factory.createVector(alphabet);
		Generator<Character> gen = Factory.createSimpleCombinationGenerator(initialVector, 3);
		PrintWriter writer = new PrintWriter("Sentences.txt");
		for (ICombinatoricsVector<Character> combination : gen) {
			for(int i=0;i<combination.getSize();i++){
			   ArrayBlockingQueue<Integer> currentPermutation = new ArrayBlockingQueue<Integer>(3);
			   currentPermutation.add((int)combination.getValue(i));
			   String sentence = decrypt(currentPermutation);
			   writer.println(sentence);
			}
		}
		writer.close();
	}
	public static String decrypt(ArrayBlockingQueue<Integer> currentPermutation) throws InterruptedException{
		char[] decryptedChars = new char[numbersInt.length];
		for(int i=0;i<numbersInt.length;i++){
			int num = currentPermutation.poll();
			decryptedChars[i] = (char) (numbersInt[i]^num);
			currentPermutation.put(num);
		}
		return new String(decryptedChars);
	}
	
	public static boolean hasEnglishWords(String sentence){
		if(sentence.contains(" "))
			return true;
		else return false;
	}
	
	
	public static void parseFile(){
		try{
		BufferedReader br = new BufferedReader(new FileReader("cipher1.txt"));
		
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) != null) {
			numbers=sCurrentLine.split(",");
		}
		numbersInt = new int[numbers.length];
		for(int i=0;i<numbers.length;i++){
			numbersInt[i]=Integer.parseInt(numbers[i]);	
		}

	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
}
