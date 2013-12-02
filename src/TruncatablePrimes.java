import java.util.ArrayList;


public class TruncatablePrimes {
	
	public static void main(String[] args){
		//long prime=3797;
		//System.out.println(isPrime(prime));
		ArrayList<String> arr = null;
		/*arr = produceLtoRNumbers(7331);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		arr=produceRtoLNumbers(31);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}*/
		
		/*arr=produceRtoLNumbers(313);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		System.out.println(arr.size());*/
		
		
		int sum=0;
		int noOfoccurancies=0;
		long i=10;
		while(noOfoccurancies<11){
			if(isPrime(i)){
				arr=produceLtoRNumbers(i);
				if(isPrimearr(arr)){
					arr=produceRtoLNumbers(i);
					if(isPrimearr(arr)){
						//String rev = new StringBuffer(new Long(i).toString()).reverse().toString();
						//if(isPrime(new Long(rev))){
							System.out.println(i);
							sum+=i;
							noOfoccurancies++;
						//}
					}
				}
			}
			i++;
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
		int realLenght=num.length();
		//num=new String(new StringBuffer(num).reverse().toString());
		ArrayList<String> arr = new ArrayList<String>();
		if(num.length()==2){
			arr.add(num.substring(0,1));
			arr.add(num.substring(1));
		}
		else{
			for(int i=0;i<realLenght-1;i++){
				num= num.substring(0, num.length()-1);
				arr.add(num);
			}
		}
		return arr;
	}
	
	
	public static ArrayList<String> produceRtoLNumbers(long n){
		String num= ""+n;
		int realLenght=num.length();
		ArrayList<String> arr = new ArrayList<String>();
		if(num.length()==2){
			arr.add(num.substring(0,1));
			arr.add(num.substring(1));
		}
		else{
			for(int i=0;i<realLenght-1;i++){
				num=num.substring(1);
				arr.add(num);
			}
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
		if(n==1)
			return false;
		else return true;
	}
}
