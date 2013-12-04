import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class AmicableNumbers {
	
	
	public static void main(String[] args){
		HashMap<Integer,Integer> numSum = new HashMap<Integer,Integer>();
		for(int i=0;i<10000;i++){
			numSum.put(i, findSumOfDivisors(i));
		}
		//System.out.println(isAmicable(220,284,284,220));
		//System.out.println(isAmicable(218,232,212,221));
		
		Iterator it = numSum.entrySet().iterator();
		int amicableSum=0;
		while(it.hasNext()){
			Map.Entry pair = (Map.Entry)it.next();
			//System.out.println((int)pair.getKey()+" "+(int)pair.getValue()+" "+(int)pair.getValue());
			Integer aValue =  new Integer((int) pair.getValue());
			if(aValue<10000 && isAmicable((int)pair.getKey(), aValue, aValue, numSum.get(aValue))){
				System.out.println((int) pair.getKey()+" "+(int) pair.getValue());
				amicableSum+=(int)pair.getKey();		
			}
		}
		System.out.println("Amicable sum is "+amicableSum);
	}
	public static boolean isAmicable(int aKey,int aValue,int bKey,int bValue){
		if(aKey==bValue && aValue==bKey && aKey!=aValue)
			return true;
		else return false;
	
	}
	
	public static int findSumOfDivisors(int n){
		int maxDivisor = n/2+1;
		int sum=0;
		for(int i=1;i<=maxDivisor;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum;
	}

}
