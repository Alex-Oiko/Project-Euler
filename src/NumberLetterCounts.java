import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;


public class NumberLetterCounts {
	
	HashMap<Integer,Integer> parser = new HashMap<Integer,Integer>();
	
	public void initialiseParser(){
		parser.put(1, 3);//one
		parser.put(2, 3);//two
		parser.put(3, 5);//three
		parser.put(4, 4);//four
		parser.put(5, 4);//five
		parser.put(6 ,3);//six
		parser.put(7, 5);//seven
		parser.put(8, 5);//eight
		parser.put(9, 4);//nine
		parser.put(10, 3);//ten
		parser.put(11, 6);//eleven
		parser.put(12, 6);//twelve
		parser.put(13, 7);//thirteen
		parser.put(14, 8);//fourteen
		parser.put(15, 7);//fifteen
		parser.put(16, 7);//sixteen
		parser.put(17, 9);//seventeen
		parser.put(18, 8);//eighteen
		parser.put(19, 8);//nineteen
		parser.put(20, 6);//twenty
		parser.put(30, 6);//thirty
		parser.put(40, 5);//forty
		parser.put(50, 5);//fifty
		parser.put(60, 5);//sixty
		parser.put(70, 7);//seventy
		parser.put(80, 6);//eighty
		parser.put(90, 6);///ninety
		parser.put(0,7);//hundred
		parser.put(-1, 3);//and
		
	}
	
	public static char[] prepareInt(int n){//return char array
		return new Integer(n).toString().toCharArray();
	}
	
	
	public int resolveTwoDigits(char[] num){
		int sum=0;
		
		String snum = ""+num[0]+num[1];
		Integer i = new Integer(snum);
		
		if(i<20 && i>=10){
			sum+=parser.get(i);
		}
		else{
			sum+= parser.get(new Integer(new String(num[0]+"0")));
			sum+=parser.get(new Integer(new String(new Character(num[1]).toString())));
		}
		
		return sum;
		
	}
	
	public int resolveThreeDigits(char[]num){
		int sum=0;
		char[] twod = new char[2];
		
		sum+=parser.get(new Integer(new String(new Character(num[0]).toString())));
		sum+=parser.get(0);//hundred
		sum+=parser.get(-1);//and
		
		twod[0]=num[1];//transfer it to a new array so i dont get fucked up results
		twod[1]=num[2];
		
		sum+=resolveTwoDigits(twod);
		
		return sum;
	}
	
	public static void main(String[] args){
		NumberLetterCounts n = new NumberLetterCounts();
		n.initialiseParser();
		int count=11;//one thousand
		
		System.out.println(n.resolveThreeDigits(prepareInt(342)));
		System.out.println(n.resolveThreeDigits(prepareInt(115)));
		
		System.out.println(n.resolveTwoDigits(prepareInt(42)));
		
		for(int i=1;i<=20;i++){
			count += n.parser.get(i);
		}
		for(int i=21;i<=99;i++){
			count+=n.resolveTwoDigits(prepareInt(i));
		}
		for(int i=100;i<999;i++){
			count+=n.resolveThreeDigits(prepareInt(i));
		}
		System.out.println(count);	
		
	}

}
