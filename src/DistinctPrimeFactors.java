import java.util.ArrayList;


public class DistinctPrimeFactors {
	
	public static void main(String[] args){
		ArrayList<Integer> arr = getDivisors(14);
		
		for(Integer in:arr){
			System.out.println(in);
		}
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
	
	public static ArrayList<Integer> getDivisors(int n){
		int maxDivisor=n/2+1;
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for(int i=1;i<maxDivisor;i++){
			if(n%i==0)
				divisors.add(i);
		}
		return divisors;
	}

}
