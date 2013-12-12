import java.util.HashMap;


public class CountingSundays {
	static HashMap<Integer,Integer> months = new HashMap<Integer,Integer>();
	static int dayCounter=1;
	static int sundayCounter=0;
	
	public static void main(String[] args){
		initialiseMonths();
		for(int year=1900;year<2001;year++){
			boolean isLeap = isLeap(year);
			for(int i=1;i<months.size();i++){
				if(isYearDivisibleby400(year)){
					simulateMonth400(i);
				}
				else
					simulateMonth(i, isLeap);
			}
			System.out.println(year);
		}
		System.out.println("Number of Sundays that fall in the first of the month is "+sundayCounter);
	}
	
	public static boolean isLeap(int year){
		if(year%4==0)
			return true;
		else return false;
	}
	
	public static void initialiseMonths(){
		months.put(1,31);//jan
		months.put(2,28);//feb
		months.put(3,31);//march
		months.put(4,30);//april
		months.put(5,31);//may
		months.put(6,30);//june
		months.put(7,31);//july
		months.put(8,31);//aug
		months.put(9,30);//sep
		months.put(10,31);//oct
		months.put(11,30);//nov
		months.put(12,31);//dec
	}
	
	public static void simulateMonth(int month, boolean isLeap){
		int monthDays=0;
		//System.out.println(month);
		if(isLeap && month==2)
			monthDays=29;
		else
			monthDays=months.get(month);
			
		for(int i=1;i<monthDays;i++){
			System.out.println(dayCounter);
			if(shouldCount(i)){
				sundayCounter++;
			}
			dayCounter++;
		}
	}
	public static void simulateMonth400(int month){			
		for(int i=1;i<months.get(month);i++){
			if(shouldCount(i)){
				sundayCounter++;
			}
			dayCounter++;
		}
	}
	public static boolean shouldCount(int i){
		if(i==1 && dayCounter%7==0)
			return true;
		else return false;
	}
	public static boolean isYearDivisibleby400(int year){
		if(year%400==0)
			return true;
		else return false;
	}

}
