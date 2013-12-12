import java.util.ArrayList;
import java.util.HashSet;

public class PandigitalProduct {
	
	static ArrayList<Character> digits;
	static HashSet<Integer> products = new HashSet<Integer>();
	
	public static void main(String[] args){
		initialiseAllDigits();
		long sum = 0;
		//System.out.println(isPandigital(39, 186, 7254));
		//System.out.println(isPandigital(42, 45, 9092));
		//System.out.println(isPandigital(42, 15, 36789));
		for(int i=0;i<10000;i++){
			for(int f=0;f<10000;f++){
				if(isPandigital(i, f, i*f)){
					products.add(i*f);
				}
			}
		}
		for(Integer prod:products){
			//System.out.println(prod);
			sum+=prod;
		}
		System.out.println("Sum is "+sum);
		
		
	}
	
	public static void initialiseAllDigits(){
		digits = new ArrayList<Character>();
		
		digits.add('1');
		digits.add('2');
		digits.add('3');
		digits.add('4');
		digits.add('5');
		digits.add('6');
		digits.add('7');
		digits.add('8');
		digits.add('9');
	}
	
	public static boolean isPandigital(int mul1,int mul2,int result){
		StringBuffer sb = new StringBuffer("");
		sb.append(new Integer(mul1)).append(new Integer(mul2)).append(new Integer(result));
		String number = sb.toString();
		char[] characters = number.toCharArray();
		ArrayList<Character> chars = new ArrayList<Character>();
		for(int i=0;i<characters.length;i++){
			chars.add(new Character(characters[i]));
		}
		if(chars.containsAll(digits) && chars.size()==9)
			return true;
		else return false;
	}

}
