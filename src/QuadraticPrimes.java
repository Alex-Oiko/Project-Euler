
public class QuadraticPrimes {
	
	public static void main(String[] args){
		int maxNumOfPrimes=0;
		int coefProd=1;
		long theA=0;long theB=0;
		
		//System.out.println(runQuadratic(-999, 61));
		
		for(int a=-1000;a<1000;a++){
			for(int b=-1000;b<1000;b++){
				if(isPrime(b)){
					int numberOfPrimes=runQuadratic(a, b);
					if(numberOfPrimes>maxNumOfPrimes){
						maxNumOfPrimes=numberOfPrimes;
						coefProd=a*b;
						theA=a;
						theB=b;
					}
				}
			}
		}
		System.out.println("product of coefficients with most primes is "+coefProd+" with "+maxNumOfPrimes+" primes in its sequence and coefficient of a " +
				""+theA+" and b "+theB);
		
	}
	public static int runQuadratic(long a,long b){
		int n=0;
		while(isPrime(Math.abs(n*n+a*n+b))){
			n++;
		}
		return n-1;
	}
	
	public static boolean isPrime(long n){
		long maxDivisor = (long) (Math.sqrt(n)-1);
		for(long i=2;i<maxDivisor;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
