import java.math.BigInteger;


public class PowerDigitSum {
	
	public static void main(String[] args){
		BigInteger b = new BigInteger("1");
		
		for(int i=1;i<=1000;i++){
			b=b.multiply(new BigInteger("2"));
		}
		System.out.println(b);
		
		char[] num = b.toString().toCharArray();
		int sum=0;
		
		
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
			sum+=new Integer(new String(new Character(num[i]).toString()));
		}
		System.out.println("\nSum is "+sum);
	}

}
