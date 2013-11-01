public class HighestPandigital{

	public static void main(String[] args){
	
		for(int i=0;i<3265920;i++){//3265920 is 9!*9...all the available permutations of an n-digit pandigital number
		
		}
	
	}
	public static int getNextPandigital(int n){
		int[] numbers= new int[10];
		numbers[0]=0;
		numbers[1]=1;
		numbers[2]=2;
		numbers[3]=3;
		numbers[4]=4;
		numbers[5]=5;
		numbers[6]=6;
		numbers[7]=7;
		numbers[8]=8;
		numbers[9]=9;
		for(int i=0;i<10;i++){
			
		}
		return n;
		
	}
	
	public static boolean isPrime(int n){
		int maxDivisble=n/2+1;		
		for(int i=2;i<maxDivisble;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}