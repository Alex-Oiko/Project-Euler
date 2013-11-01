import java.lang.Long;

public class LargeFiboNumber{

	public static void main(String[] args){
		Fibonacci();
	}
	
	public static void Fibonacci(){
		long f1=0L;
		long f2=1L;
		long fn;
		
		for(long i=0L;i<Long.MAX_VALUE;i++){
			fn=f1+f2;
			if(new Long(fn).toString().length()==1000)
				System.out.println("First fibonacci with over 1000 digits is "+fn);
				
			f1=f2;
			f2=fn;
		}
	}

}