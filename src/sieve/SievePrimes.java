package sieve;

import java.util.ArrayList;

public class SievePrimes {
	
	public static ArrayList<Integer> getPrimes(int n){
		ArrayList<Inte> temp = new ArrayList<Inte>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		temp.add(null);//for 0
		temp.add(null);//for 1
		for(int i=2;i<=n;i++){
			temp.add(new Inte(i,false));
		}
		for(int i=2;i<temp.size();i++){
			Inte s = temp.get(i);
			//if(!s.isFlag())
				//primes.add(s.value);
			for(int f=s.getValue();f<temp.size();f++){
				int result = s.getValue()*f;
				if(result>=temp.size())
					break;
				Inte inte = temp.get(result);
				inte.setFlag(true);
			}
		}
		for(int i=2;i<temp.size();i++){
			if(!temp.get(i).isFlag())
				primes.add(temp.get(i).value);
		}
		return primes;
		
	}
}
