import java.util.ArrayList;


public class PandigitalPrime {
	
	public static void main(String[] args){
		System.out.println(isPandigital(new Integer(2143).toString()));
		for(int i=0;i<10000000;i++){
			if(isPrime(i)&& isPandigital(new Integer(i).toString())){
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPandigital(String num){
		ArrayList<String> numChar = new ArrayList<String>();
		char[] numChararr = num.toCharArray();
		for(int i=0;i<numChararr.length;i++){
			numChar.add(""+numChararr[i]);
		}
		for(int i=1;i<=num.length();i++){
			if(!numChar.contains(new Integer(i).toString())){
				return false;
			}
		}
		return true;
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
