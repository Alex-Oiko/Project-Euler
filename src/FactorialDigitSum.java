import java.math.BigInteger;


public class FactorialDigitSum {
	
	
	public static void main(String[] args){
		BigInteger fact = new BigInteger("1");
		int sum = 0;
		
		for(int i=1;i<=100;i++){
			fact=fact.multiply(new BigInteger(new Integer(i).toString()));
		}
		System.out.println(fact.toString());
		char[] sfact=fact.toString().toCharArray();
		
		for(int i=0;i<sfact.length;i++){
			sum+=new Integer(new String(new Character(sfact[i]).toString()));
		}
		
		System.out.println(sum);
	}

}
