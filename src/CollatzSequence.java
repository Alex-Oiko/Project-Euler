
public class CollatzSequence {
	
	
	public static void main(String[] args){
		int chain=1;
		int longestChain=0;
		long result=0;
		int wantedNumber=0;
		CollatzSequence c = new CollatzSequence();
		
		for(int i=1;i<1000000;i++){
			result=c.collatz(i);
			//System.out.println(i);
			while(result!=1){
				result=c.collatz(result);
				chain++;
			}
			chain++;//for when the chain finally hits 1
			if(chain>longestChain){
				wantedNumber=i;
				longestChain=chain;
			}
			chain=1;//to include the first term
		}
		System.out.println("Longest chain is:"+longestChain+" and is produced from "+wantedNumber);
	}

	
	public long collatz(long n){
		long result=0;
		
		if(n%2==0){
			result=n/2;
		}
		else{
			result=3*n+1;
		}
		return result;		
	}
}
