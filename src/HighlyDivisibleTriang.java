import java.lang.Math;

public class HighlyDivisibleTriang{
	
	public static void main(String[] args){
		int divisors=0;
		int counter=0;
		int triangular=0;
		while(divisors<500){
			counter++;
			triangular=getTriangular(counter);
			divisors=getDivisors(triangular);
			//System.out.println(triangular+" "+divisors);
		}
		System.out.println("Triangular number is "+triangular+" with "+divisors+" divisors");
	}
	
	public static int getTriangular(int n){
		int triangular=0;
		for(int i=1;i<=n;i++){
			triangular+=i;
		}
		return triangular;
	}	
	
	public static int getDivisors(int n){
		int maxDivisor=n/2+1;
		int divisors=1;
		for(int i=1;i<maxDivisor;i++){
			if(n%i==0)
				divisors++;
		}
		return divisors;
	}

}