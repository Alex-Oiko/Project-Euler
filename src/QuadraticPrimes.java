
public class QuadraticPrimes {
	
	public static void main(String[] args){
		int maxNumOfPrimes=0;
		int coefProd=1;
		
		for(int a=0;a<1000;a++){
			for(int b=0;b<1000;b++){
				if(isPrime(b)){
					int numberOfPrimes=runQuadratic(a, b);
					if(numberOfPrimes>maxNumOfPrimes){
						maxNumOfPrimes=numberOfPrimes;
						coefProd=a*b;
					}
				}
			}
		}
		System.out.println("product of coefficients with most primes is "+coefProd+" with "+maxNumOfPrimes+" primes in its sequence");
		
	}
	public static int runQuadratic(int a,int b){
		boolean isNotPrime=true;
		int n=0;
		int result=0;
		int counter=0;
		while(isNotPrime){
			result = n*n+a*n+b;
			isNotPrime=isPrime(result);
			counter++;
			n++;
		}
		System.out.println(counter-1+" "+a+" "+b);
		return counter-1;
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
