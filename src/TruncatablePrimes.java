import java.util.ArrayList;


public class TruncatablePrimes {
	
	public static void main(String[] args){
		//long prime=3797;
		//System.out.println(isPrime(prime));
		//System.out.println();
		ArrayList<String> arr = null;
		/*for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		System.out.println(isPrimearr(arr));
		System.out.println();
		arr=produceLtoRNumbers(prime);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		System.out.println(isPrimearr(arr));
		*/
		
		int sum=0;
		int noOfoccurancies=0;
		for(long i=100;i<1000000;i++){	
			if(isPrime(i)){
				arr=produceLtoRNumbers(i);
				/*for(int s=0;s<arr.size();s++){
					System.out.println(arr.get(s));
				}*/
				//System.out.println("hello "+i);
				if(isPrimearr(arr)){
					arr=produceRtoLNumbers(i);
					if(isPrimearr(arr)){
						System.out.println(i);
						sum+=i;
						noOfoccurancies++;
					}
				}
				
			}
		}
		System.out.println("Sum is "+sum+", number of occurancies is "+noOfoccurancies);
	}
	
	public static boolean isPrimearr(ArrayList<String> arr){
		for(int i=0;i<arr.size();i++){
			if(!isPrime(Integer.parseInt(arr.get(i))))
				return false ;
		}
		return true;
	}
	
	public static ArrayList<String> produceLtoRNumbers(long n){
		String num= ""+n;
		//num=new String(new StringBuffer(num).reverse().toString());
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<=num.length();i++){
			num= num.substring(0, num.length()-1);
			arr.add(num);
		}
		return arr;
	}
	
	
	public static ArrayList<String> produceRtoLNumbers(long n){
		String num= ""+n;
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<=num.length();i++){
			num=num.substring(1);
			arr.add(num);
		}
		return arr;
	}
	
	public static char[] breakNumber(long n){
		return new Long(n).toString().toCharArray();
	}

	public static boolean isPrime(long n){
		long maxDivisor = n/2+1;
		for(long i=2;i<maxDivisor;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
