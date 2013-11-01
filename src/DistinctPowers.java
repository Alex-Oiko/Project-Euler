import java.math.BigInteger;
import java.util.*;

public class DistinctPowers{

	public static void main(String []args){
		ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
	
		for(int i=2;i<=100;i++){
			for(int k=2;k<=100;k++){
				BigInteger number = calculatePower(i,k);
				//System.out.println(number.toString());
				if(!isThere(arr,number)){
					arr.add(number);
				}
			}
		}
		Collections.sort(arr);
		System.out.println("STOP");
		/*for(BigInteger num:arr){
			System.out.println(num);
		}*/
		System.out.println("Number of Distinct Powers are: "+arr.size());
	}


	public static BigInteger calculatePower(int base,int power){
		BigInteger result=new BigInteger(new Integer(base).toString());
		for(int i=1;i<power;i++){
			result=result.multiply(new BigInteger(new Integer(base).toString()));
		}
		return result;
	}	
	
	public static Boolean isThere(ArrayList<BigInteger> arr,BigInteger i){
		return arr.contains(i);
			
	}
}