public class TenThousandOnePrime{

public static void main(String[] args){
	int primeCounter=0;
	for(int i=2;i<10000000;i++){
		if(isPrime(i)){
			//System.out.println(i);
			primeCounter++;
			if(primeCounter==10001)
				System.out.println("The prime is:"+i);
		}
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

}