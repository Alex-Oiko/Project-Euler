import java.lang.Math;

public class TriPentHex{

	public static void main(String[] args){
		/* Test to see if methods return correct result
		System.out.println(isTriang(1));
		System.out.println(isTriang(3));
		System.out.println(isTriang(6));
		System.out.println(isTriang(10));
		System.out.println(isTriang(15));
		System.out.println(isTriang(27));
		
		System.out.println("Pentagonal");
		System.out.println(isPentagonal(1));
		System.out.println(isPentagonal(5));
		System.out.println(isPentagonal(12));
		System.out.println(isPentagonal(22));
		System.out.println(isPentagonal(35));
		System.out.println(isPentagonal(27));
		
		System.out.println("Hexagonal");
		System.out.println(isHexagonal(1));
		System.out.println(isHexagonal(6));
		System.out.println(isHexagonal(15));
		System.out.println(isHexagonal(28));
		System.out.println(isHexagonal(45));
		System.out.println(isHexagonal(27));
		
		System.out.println("40755");
		System.out.println(isTriang(40755));
		System.out.println(isPentagonal(40755));
		System.out.println(isHexagonal(40755));
		*/
		
		for(long i=0;i<100000000000L;i++){
			if(isPentagonal(i) && isHexagonal(i) && isTriang(i)){
				System.out.println("Number is "+i);
			}
		}
	}
	
	public static boolean isPentagonal(long n){
		double y=0;
		y=(1+Math.sqrt(1+24*n))/6;
		return (int) y==y;
	}
	
	public static boolean isHexagonal(long n){
		double y=0;
		y=(1+Math.sqrt(1+8*n))/4;
		return (int) y==y;
	}

	public static boolean isTriang(long n){
		double y=0;
		y=(-1+Math.sqrt(1+8*n))/2;
		return (int) y==y;
	}

}