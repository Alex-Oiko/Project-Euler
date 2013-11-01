
public class DivisionTriangNumbers {
	
	public static void main(String []args){
		int trinum=0;
		int divisors_counter=0;
		
		for(int i=1;i<100000;i++){
			System.out.println(i);
			trinum=triangleNumbers(i);
			for(int j=1;j<trinum/2+1;j++){
				if(trinum%j==0){
					divisors_counter++;
				}
			}
			
			if(divisors_counter>500){
				System.out.println(trinum);
				return;
			}
			divisors_counter=0;
		}
		
	}
	
	public static int triangleNumbers(int n){
		int num=0;
		
		for(int i=1;i<n;i++){
			num+=i;
		}
		return num;
	}

}
