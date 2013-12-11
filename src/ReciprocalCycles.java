import java.util.ArrayList;


public class ReciprocalCycles {
	
	public static void main(String[] args){

		System.out.println(findPattern(7));
		System.out.println(findPattern(6));
		
		int maxRemainder=0;
		int biggestNo=0;
		for(int d=1;d<1000;d++){
			int remainder = findPattern(d);
			if(remainder>maxRemainder){
				biggestNo=d;
				maxRemainder=remainder;
			}
		}
		System.out.println("The biggest recyprocal cycle exists in number "+biggestNo+" with a recyprocal cycle of "+maxRemainder);
	}
	public static int findPattern(int n){
		ArrayList<Integer> remainders = new ArrayList<Integer>();
		int remainder=0;
		int counter=10;
		boolean isPatternStopped=true;
		remainders.add(1%n);//first entry
		//System.out.println("First entry "+remainders.get(0));
		while(isPatternStopped){
			remainder=counter%n;
			//remainders.add(remainder);
			counter+=10;
			if(remainders.contains(remainder))
				isPatternStopped=!isPatternStopped;
			else
				remainders.add(remainder);
			//System.out.println(remainder+" "+counter+" "+remainders.contains(remainder));
		}
		return remainders.size()+1;
		
	}
	
	
	
	/*public static void findPattern(String fractionalPart){
		ArrayList<Integer> nums = convertNum(fractionalPart);
		ArrayList<Integer> patternBuffer = new ArrayList<Integer>();
		for(int i=0;i<nums.size();i++){
			if(patternBuffer.get(0)==nums.get(i)){
					
			}
			patternBuffer.add(i);
			System.out.println(nums.get(i));
		}
	}
	
	public static ArrayList<Integer> convertNum(String fractionalPart){
		char[] numbers = fractionalPart.toCharArray();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=2;i<numbers.length;i++){
			nums.add(Character.getNumericValue(numbers[i]));
		}
		return nums;
	}*/

}
