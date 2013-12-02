import java.util.ArrayList;


public class PermutedMultiples {
	
	public static void main(String[] args){
		
		int counter=2;
		boolean a=true;
		while(a){
			if(haveSameDigits(new Integer(counter).toString(), new Integer(counter*2).toString()) &&
					haveSameDigits(new Integer(counter).toString(), new Integer(counter*3).toString()) &&
							haveSameDigits(new Integer(counter).toString(), new Integer(counter*4).toString()) &&
									haveSameDigits(new Integer(counter).toString(), new Integer(counter*5).toString()) &&
											haveSameDigits(new Integer(counter).toString(), new Integer(counter*6).toString())){
				System.out.println(counter);
				a=false;
			}
			counter++;
		}
		//System.out.println(haveSameDigits(new Integer(125874).toString(),new Integer(125874).toString()));
		
	}

	
	public static boolean haveSameDigits(String initial,String multiple){
		if(initial.length()!=multiple.length()){
			return false;
		}
		else{
			char[] initialA = initial.toCharArray();
			char[] multipleA = multiple.toCharArray();
			ArrayList<Character> init = new ArrayList<Character>();
			ArrayList<Character> mult = new ArrayList<Character>();
			
			for(int i=0;i<initialA.length;i++){
				init.add(initialA[i]);
				mult.add(multipleA[i]);
			}
			
			if(mult.containsAll(init))
				return true;
			else return false;				
		}
	}
}
