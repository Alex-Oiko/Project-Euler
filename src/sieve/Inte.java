package sieve;

public class Inte{
	
	int value=0;
	boolean flag;
	
	public Inte(int value,boolean flag){
		this.value=value;
		this.flag=flag;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public String toString(){
		return "Inte: " +
				"Value: "+(this.value==0?"null" :this.value)+
				"	flag: "+this.flag;
	
	}
	
}