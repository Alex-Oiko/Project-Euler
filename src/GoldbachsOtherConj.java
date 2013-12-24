import java.util.ArrayList;

import sieve.SievePrimes;


public class GoldbachsOtherConj {
	
	public static void main(String[] args){
		int range=10000;
		ArrayList<Integer> primes = SievePrimes.getPrimes(range);
		/*for(Integer prime:primes){
			System.out.println(prime);
		}*/
		System.out.println("Found the primes in the range of 0 to "+range+". On to the processing");
		/*System.out.println(isGoldbachComposite(9, primes));
		System.out.println(isGoldbachComposite(15, primes));
		System.out.println(isGoldbachComposite(21, primes));
		System.out.println(isGoldbachComposite(25, primes));
		System.out.println(isGoldbachComposite(27, primes));
		System.out.println(isGoldbachComposite(33, primes));*/
		
		for(int i=10;i<range+1;i++){
			if(!isEven(i) && !primes.contains(i) && !isGoldbachComposite(i, primes)){		
				System.out.println("Smallest non goldbach odd composite is: "+i);
				return;
			}
		}
		System.out.println("Ended without any results");
	}
	public static boolean isEven(int n){
		if(n%2==0)
			return true;
		else return false;
	}
	public static boolean isGoldbachComposite(int n,ArrayList<Integer> primes){
		for(int f=0;f<n/2;f++){
			for(int i=0;i<primes.size();i++){
				if(primes.get(i)+2*f*f==n){
					//System.out.println("The formula that solved it is "+n+" = "+primes.get(i)+" + 2*"+f+"^2");
					return true;
				}
			}
		}
		return false;
	}

}
