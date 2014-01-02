
public class PrimePermutations {
	
	public static void main(String[] args){
		for(int i=1000;i<9994;i++){
			System.out.println(i);
			if(isPrime(i)){
				int counter=1;
				while(i+counter<10000){
					int result = i+counter;
					int result1= i+2*counter;
					if(isPrime(result) && isPrime(result1)){
						System.out.println("i is "+i+" i+counter is "+result+" i+2*counter"+result1);
					}
				}
			}
		}
	}
	
	public static boolean isPrime(int n){
		int maxDivisor = (int) Math.sqrt(n);
		for(int i=2;i<maxDivisor;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
