import java.math.BigInteger;


public class OneThousandFibo {
	
	public static void main(String[] args){
		
		boolean isonet=true;
		int counter=3;//for the first 3 terms that are not accounted for in the beginning
		BigInteger temp=new BigInteger("1");
		BigInteger n1 = new BigInteger("1");
		BigInteger fn = new BigInteger("2");
		while(isonet){
			temp=fn;
			fn=fn.add(n1);
			n1=temp;
			counter++;
			if(fn.toString().length()>=1000){
				isonet=false;
			}
		}
		System.out.println("first term to have 1000 digits is "+counter);
		
	}

}
