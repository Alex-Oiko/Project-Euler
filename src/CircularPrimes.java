import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;


public class CircularPrimes {
	
	public static void main(String[] args){
		
		//System.out.println(rotate("197".toCharArray()));
		//System.out.println(rotate("971".toCharArray()));
		ArrayList<Integer> rot = rotations(197);
		//for(Integer num:rot){
			//System.out.println(num);
		//}
		//System.out.println(isCircular(rot));
		int counter=0;
		for(int i=2;i<1000000;i++){
			if(isPrime(i)){
				if(isCircular(rotations(i))){
					counter++;
				}
			}
		}
		System.out.println("Number of circular primes is "+counter);
		
	}
	
	public static boolean isCircular(ArrayList<Integer> numbers){
		for(Integer pr:numbers){
			if(!isPrime(pr))
				return false;
		}
		return true;
		
	}
	
	public static ArrayList<Integer> rotations(int n){
		ArrayList<Integer> rotations = new ArrayList<Integer>(); 
		String number = new Integer(n).toString();
		char[] digits = number.toCharArray();
		for(int i=0;i<number.length()-1;i++){
			String rotated = rotate(digits);
			rotations.add(Integer.parseInt(rotated));
			digits = rotated.toCharArray();
		}
		return rotations;
	}
	public static String rotate(char[] digits){
		char lastdigit=' ';
		AbstractQueue<Character> q = new ArrayBlockingQueue<Character>(digits.length);
		for(int i=0;i<digits.length;i++){
			q.add(digits[i]);
		}
		char head = q.poll();
		q.add(head);
		StringBuffer rotatedNumber = new StringBuffer("");
		while(!q.isEmpty()){
			rotatedNumber.append(q.poll());
		}
		return rotatedNumber.toString();
	}
	
	public static boolean isPrime(int n){
		int maxDivisor = n/2+1;
		for(int i=2;i<maxDivisor;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
