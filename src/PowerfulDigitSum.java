import java.math.BigInteger;


public class PowerfulDigitSum {
	
	public static void main(String[] args){
		int highest=0;
		//System.out.println(producePower(10,100));
		//System.out.println(produceDigitSum(producePower(10, 100).toString().toCharArray()));
		for(int i=1;i<100;i++){
			for(int f=1;f<100;f++){
				int sum=produceDigitSum(producePower(i, f).toString().toCharArray());
				if(sum>highest){
					highest=sum;
				}
			}
		}
		System.out.println("Highest Digit sum is "+highest);
	}
	
	public static int produceDigitSum(char[] numc){
		int result=0;
		for(int i=0;i<numc.length;i++){
			result+=Integer.parseInt(new String(new Character(numc[i]).toString()));
		}
		return result;
	}
	
	public static BigInteger producePower(int a,int b){
		BigInteger a1 = new BigInteger(new Integer(a).toString());
		BigInteger result = new BigInteger("1");
		for(int i=0;i<=b;i++){
			//System.out.println(result);
			result = result.multiply(a1);
		}
		return result;
	}

}
