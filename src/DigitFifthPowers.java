
public class DigitFifthPowers {
	
	public static void main(String[] args){
		
		long bigSum=0;
		for(long i=2;i<10000000;i++){
			long sum=0;
			char[] numchar = breakNumber(i);
			for(int f=0;f<numchar.length;f++){
				sum+=calculateFifthPower(new Long(new String(new Character(numchar[f]).toString())));
			}
			if(sum==i){
				//System.out.println(sum);
				bigSum+=i;
			}
		}
		System.out.println(bigSum);
		
	}
	
	public static long calculateFifthPower(long n){
		long result=1;
		for(int i=0;i<5;i++){
			result*=n;
		}
		return result;
	}
	public static char[] breakNumber(long n){
		return new Long(n).toString().toCharArray();
	}

}
