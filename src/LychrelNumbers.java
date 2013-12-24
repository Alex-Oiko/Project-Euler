import java.math.BigInteger;


public class LychrelNumbers {
	
	public static void main(String[] args){
		
		/*System.out.println("Checking reverse method");
		System.out.println("47 "+produceReverse(new BigInteger("47")));
		System.out.println("349 "+produceReverse(new BigInteger("349")));
		System.out.println("1292 "+produceReverse(new BigInteger("1292")));
		System.out.println("4213 "+produceReverse(new BigInteger("4213")));
		System.out.println("3124 "+produceReverse(new BigInteger("3124")));
		
		System.out.println("\n Checking if isPalindrome is working");
		System.out.println("349 "+isPalindrome(new BigInteger("349")));
		System.out.println("1292 "+isPalindrome(new BigInteger("1292")));
		System.out.println("4213 "+isPalindrome(new BigInteger("4213")));
		System.out.println("7337 "+isPalindrome(new BigInteger("7337")));
		System.out.println("4994 "+isPalindrome(new BigInteger("4994")));
		
		System.out.println("\n Checking if isLychrel is working");
		System.out.println(isLychrel(new BigInteger("349"), produceReverse(new BigInteger("349"))));
		System.out.println(isLychrel(new BigInteger("196"), produceReverse(new BigInteger("196"))));
		System.out.println(isLychrel(new BigInteger("4994"), produceReverse(new BigInteger("4994"))));*/
		
		int counter=0;
		for(int i=10;i<10000;i++){
			if(isLychrel(new BigInteger(""+i), produceReverse(new BigInteger(""+i))))
				counter++;
		}
		System.out.println("Lychrel counter is "+counter);
	}
	
	public static BigInteger produceReverse(BigInteger n){
		return new BigInteger((new StringBuffer(n.toString()).reverse().toString()));
	}
	public static boolean isPalindrome(BigInteger n){
		if(n.toString().equals(produceReverse(n).toString()))
			return true;
		else return false;
		
	}
	
	public static boolean isLychrel(BigInteger n, BigInteger nReverse){
		BigInteger number=n;
		BigInteger numberReverse=nReverse;
		BigInteger result=new BigInteger("0");
		for(int i=0;i<50;i++){
			result=number.add(numberReverse);
			if(isPalindrome(result)){
				return false;
			}
			else{
				number=result;
				numberReverse=produceReverse(result);
			}
		}
		return true;
	}

}
