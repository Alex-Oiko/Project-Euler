public class SummationOfPrimes{

public static void main(String[] args){
	int primeSum=0;
	for(int i=2;i<2000000;i++){
		if(isPrime(i)){
			primeSum+=i;
		}
	}
	System.out.println("Sum of primes is "+primeSum);
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