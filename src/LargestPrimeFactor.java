import java.math.BigInteger;


public class LargestPrimeFactor {
	
	public static void main(String[] args){
		
	
		BigInteger i =new BigInteger("600851475143");
		System.out.println(i);
		BigInteger zero = new BigInteger("0");
		for(int k=1;k<Integer.MAX_VALUE;k++){
			BigInteger t = i.remainder(new BigInteger(new Integer(k).toString()));
			if(t.compareTo(zero)==0){
				System.out.println(k);
			}
			
		}
	}

}
