import java.util.ArrayList;

/**
 * 
 * @author aoikonomou
 * 
 * Off by ~300 :/
 *
 */
public class NonAbundantSums {
	
	public static void main(String[] args){
		ArrayList<Integer> abundants = new ArrayList<Integer>();
		
		/*abundants=findDivisors(28);
		for(int i=0;i<abundants.size();i++){
			System.out.println(abundants.get(i));
		}
		System.out.println(isAbundant(abundants, 28));
		
		abundants=findDivisors(12);
		for(int i=0;i<abundants.size();i++){
			System.out.println(abundants.get(i));
		}
		System.out.println(isAbundant(abundants, 12));*/
		for(int i=12;i<=28123;i++){
			if(isAbundant(findDivisors(i), i)){
				abundants.add(i);
			}
		}
		System.out.println("found all abundants. size of arraylist is "+abundants.size());
		System.out.println(isSumOfTwoAbundants(abundants, 24));
		System.out.println(isSumOfTwoAbundants(abundants,25));
		int sum=0;
		for(int i=24;i<=28123;i++){
			if(!isSumOfTwoAbundants(abundants, i)){
				//System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum is "+sum);
		
		
	}
	public static boolean isSumOfTwoAbundants(ArrayList<Integer> abundants,int number){
		for(int i=0;i<abundants.size();i++){
			if(number-abundants.get(i)<0)
				continue;
			else if(abundants.contains(number-abundants.get(i)))
				return true;
			
		}
		return false;
		
	}
	
	public static ArrayList<Integer> findDivisors(int n){
		int upperLimit = (n/2)+1;
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for(int i=1;i<upperLimit;i++){
			if(n%i==0){
				divisors.add(i);
			}
		}
		return divisors;
	}
	public static boolean isAbundant(ArrayList<Integer> divisors,int number){
		int sumOfDivisors=0;
		for(int i=0;i<divisors.size();i++){
			sumOfDivisors+=divisors.get(i);
		}
		if(sumOfDivisors>number)
			return true;
		else return false;
	}

}
