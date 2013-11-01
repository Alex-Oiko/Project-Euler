
public class DoubleBasePalindromes {
	
	public static void main(String[] args){
		
		int finalsum=0;
		DoubleBasePalindromes dbp = new DoubleBasePalindromes();
		
		for(int i=0;i<1000000;i++){
			if(dbp.isPalindromeBinary(i) && dbp.isPalindromeDecimal(i)){
				finalsum+=i;
			}	
		}
		
		System.out.println(finalsum);
		
		//System.out.println(Integer.toBinaryString(585));	
	}
	
	public boolean isPalindromeDecimal(int n){
		Integer i = new Integer(n);
		
		String num = i.toString();
		String reversednum = new StringBuffer(num).reverse().toString();
		
		if(!num.equals(reversednum)){
			return false;
		}
		else return true;
	}
	public boolean isPalindromeBinary(int n){
		String num = Integer.toBinaryString(n);
		String reversedNum = new StringBuffer(num).reverse().toString();
		
		char[] numChar = num.toCharArray();
		
		if(!num.equals(reversedNum) || numChar[0]=='0'){
			return false;
		}
		else return true;
	}
	
	

}
