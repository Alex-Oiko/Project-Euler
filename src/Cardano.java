import java.lang.*;

public class Cardano{

	public static void main(String[] args){
		System.out.println(Cardano(2,1,5));
		System.out.println(Cardano(2,1,4));
		int triplets=0;
		
		for(long a=0;a<1000;a++){
			for(long b=0;b<1000;b++){
				for(long c=0;c<1000;c++){
					if(triplets==149)
						continue;
					if(Cardano(a,b,c)){
						System.out.println(a+" "+b+" "+c);
						triplets++;
					}
				}
			}
		}
		System.out.println("Number of triplets "+triplets);
		
	}
	
	public static boolean Cardano(long a,long b,long c){
		return Math.cbrt(a+b*Math.sqrt(c))+Math.cbrt(a-b*Math.sqrt(c))==1;
	
	}
}