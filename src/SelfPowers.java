import java.math.BigInteger;


public class SelfPowers {
	
	public static void main(String[] args){
		BigInteger k = new BigInteger("0");
		
		for(int i=1;i<=1000;i++){
			BigInteger b = new BigInteger(new String(""+i));
			b=b.pow(i);
			k=k.add(b);
		}
		System.out.println(k);
		
		char[] num=k.toString().toCharArray();
		
		for(int i=num.length-10;i<num.length;i++){
			System.out.print(num[i]);
		}
	}

}
