import java.math.BigInteger;


public class PowerfulDigitCounts {
	
	public static void main(String[] args){
		
		int counter=0;
		
		for(int i=0;i<1000;i++){
			for(int f=0;f<1000;f++){
				BigInteger result = calculatePower(i, f);
				if(isPowerful(result.toString(), f)){
					System.out.println(i);
					counter++;
				}
			}
		}
		
		System.out.println("Number of powerful numbers are "+counter);
		
	}
	
	public static boolean isPowerful(String number,int power){
		if(number.length()==power)
			return true;
		else return false;
		
	}
	
	public static BigInteger calculatePower(int a,int b){
		BigInteger result = new BigInteger("1");
		BigInteger base  = new BigInteger(new Integer(a).toString());
		for(int i=0;i<b;i++){
			result = result.multiply(base);
		}
		return result;
	}

}
