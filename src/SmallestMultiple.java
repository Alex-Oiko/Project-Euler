
public class SmallestMultiple {

	public static void main(String[] args){
		
		boolean isDivided=true;
		
		for(int i=0;i<1000000000;i++){
			for(int j=1;j<=20;j++){
				if(i%j!=0){
					isDivided=false;
				}
			}
			if(isDivided==false){
				isDivided=true;
				continue;
			}
			else{
				System.out.println("Number is "+i);
			}
		}
	}
}
