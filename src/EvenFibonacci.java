
public class EvenFibonacci {

	public int fibonacci(int n){
		if(n<2){
			return 1;
		}
		
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args){
		EvenFibonacci e = new EvenFibonacci();
		int i=2;
		int sum=0;
		int finalsum=0;
		
		while(sum<4000000){
			sum=e.fibonacci(i);
			i++;
			if(sum%2==0){
				finalsum=finalsum+sum;
			}
		}
		System.out.println(finalsum);
	}
}
