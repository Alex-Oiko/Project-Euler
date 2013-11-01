import java.util.ArrayList;


public class Pentagonal {
	
	public static ArrayList<Integer> pentagonals(){
		ArrayList<Integer> pentagonals = new ArrayList<Integer>();
		for(int i=1;i<=100000	;i++){
			pentagonals.add(i*(3*i-1)/2);
		}
		
		/*for(int i=0;i<pentagonals.size();i++){
			System.out.print(pentagonals.get(i)+" ");
		}*/
		return pentagonals;
	}
	public static boolean isPentagonal(int i,int k,ArrayList<Integer> pentagonals){
		int add = i+k;
		int sub = Math.abs(i-k);
		//System.out.println("i is:"+i+"k is:"+k);
		if(pentagonals.contains(add) && i!=k && pentagonals.contains(sub)){
			System.out.println("asdasdas");
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> pentagonals = pentagonals();
		int difference=0,minimised=5000;
		
		for(int i=0;i<pentagonals.size();i++){
			for(int k=0;k<pentagonals.size();k++){
				if(isPentagonal(pentagonals.get(i), pentagonals.get(k), pentagonals)){
					difference=Math.abs(pentagonals.get(i)-pentagonals.get(k));
					//System.out.println("Difference is:"+difference);
					if(difference<minimised){
						minimised=difference;
					}
				}
			}
		}
		System.out.println("D is:"+minimised);
	}

}
