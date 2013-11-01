
public class PythagorianTriplet {
	
	public static void main(String[] args){
		
		PythagorianTriplet p = new PythagorianTriplet();
		
		for(int a=0;a<1000;a++){
			for(int b=0;b<1000;b++){
				for(int c=0;c<1000;c++){
					if(a+b+c==1000 && p.checkPythagorean(a, b, c)){
						System.out.println("a is:"+a+" b is "+b+" c is "+c+" and their product is "+a*b*c);
					}
				}
			}
		}
	}
	
	public boolean checkPythagorean(int a,int b,int c){
		if(a*a+b*b==c*c){
			return true;
		}
		else return false;
	}

}
