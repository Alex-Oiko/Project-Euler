import java.math.BigInteger;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;


public class CombinatoricSelections {
	
	public static void main(String[] args){
		int gt1=0;

		
		//System.out.println(produceCombinatoric(new BigInteger(new Integer(5).toString()), new BigInteger(new Integer(3).toString())));
		//System.out.println(produceCombinatoric(new BigInteger(new Integer(23).toString()), new BigInteger(new Integer(10).toString())));
		//System.out.println(produceFactorial(23));
		//System.out.println(produceFactorial(10));
		//System.out.println(produceFactorial(new BigInteger(new Integer(5).toString())));
		
		for(int i=23;i<=100;i++){
			for(int f=1;f<=i;f++){
				BigInteger result = produceCombinatoric(new BigInteger(new Integer(i).toString()), new BigInteger(new Integer(f).toString()));
				if(result.compareTo(new BigInteger(new Integer(1000000).toString()))==1){
					gt1++;
				}
			}
		}
		System.out.println(gt1);
	}

	public static BigInteger produceCombinatoric(BigInteger n,BigInteger selection){
		return produceFactorial(n).divide((produceFactorial(selection).multiply((produceFactorial(n.subtract(selection))))));
	}
	public static BigInteger produceFactorial(BigInteger n){
		BigInteger result = new BigInteger("1");
		for(int i=1;i<=Integer.parseInt(n.toString());i++){
			result=result.multiply(new BigInteger(new Integer(i).toString()));
		}
		return result;
	}

}
