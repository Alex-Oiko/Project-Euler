import java.math.BigInteger;


public class ChampernowneConstant {
	
	public static void main(String[] args){
		
	}
	
	public static BigInteger produceDenomSum(int n){
		BigInteger result = new BigInteger("0");
		BigInteger ten = new BigInteger("10");
		BigInteger powerten = new BigInteger("1");
		for(int l=1;l<n;l++){
			for(int p=0;p<l-1;p++){
				powerten.multiply(ten);
			}
			result.add(powerten.multiply(new BigInteger(new Integer(l).toString())));
		}
		return result;
	}
	public static BigInteger produceInnerSum(int n){
		BigInteger k = new BigInteger("1");
		BigInteger upperLimit = new BigInteger("1");
		BigInteger ten = new BigInteger("10");
		BigInteger result = new BigInteger("1");
		BigInteger num = new BigInteger("1");
		for(int i=0;i<n;i++){
			k.multiply(ten);
			upperLimit.multiply(ten);
		}
		num=produceDenomSum(n).multiply(new BigInteger(new Integer(9).toString()));//denomSum*9
		return num;//this is wrong
	}

}
