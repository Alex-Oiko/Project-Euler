
public class Palindrome {

	
	public static void main(String[] args){
		
		Palindrome p = new Palindrome();
		int maxP=0;
		
		for(int i=999;i>100;i--){
			for(int k=999;k>100;k--){
				if(p.isPalindrome(i,k)){
					return;
				}
			}
		}
	}
	
	public boolean isPalindrome(int d,int k){
		Integer i = new Integer(d*k);
		
		String num = i.toString();
		String reversednum = new StringBuffer(num).reverse().toString();
		
		if(!num.equals(reversednum)){
			return false;
		}
		
		System.out.println("final result is "+d*k+". d is:"+d+" k:"+k);
		return true;
	}

}
