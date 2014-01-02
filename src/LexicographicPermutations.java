import java.util.ArrayList;
import java.util.Collections;

import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;


public class LexicographicPermutations {
	
	
	public static void main(String[] args){
		ArrayList<Long> numbers = new ArrayList<Long>();
		ICombinatoricsVector<Integer> initialVector = Factory.createVector(new Integer[]{0,1,2,3,4,5,6,7,8,9});
		Generator<Integer> gen = Factory.createPermutationGenerator(initialVector);
		
		
		for (ICombinatoricsVector<Integer> perm : gen){
			StringBuffer sb = new StringBuffer("");
			for(Integer p:perm){
				sb.append(p);
			}
			numbers.add(Long.parseLong(sb.toString()));
		}
		System.out.println(numbers.size());
		Collections.sort(numbers);
		System.out.println(numbers.get(999999));
	}

}
