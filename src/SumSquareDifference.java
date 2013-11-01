
public class SumSquareDifference {
	
	public static void main(String[] args){
		
		SumSquareDifference s = new SumSquareDifference();
		
		System.out.println(s.squareSum()-s.sumSquares());
		
	}
	
	public int sumSquares(){
		int sum=0;
		
		for(int i=0;i<=100;i++){
			sum+=i*i;
		}
		return sum;
	}
	
	public int squareSum(){
		int sum=0;
		
		for(int i=0;i<=100;i++){
			sum+=i;
		}
		return sum*sum;
	}

}
