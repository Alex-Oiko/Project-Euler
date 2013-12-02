package SquareRootConv;

import java.math.BigInteger;

public class Fraction {
	
	private BigInteger num;
	private BigInteger denom;
	
	public Fraction(BigInteger numerator,BigInteger denom){
		this.num=numerator;
		this.denom=denom;
	}
	
	public Fraction add(Fraction frac){
		
		if(frac.getDenom().compareTo(new BigInteger("0"))==0){
			return new Fraction(frac.getNum().multiply(this.denom).add(this.num),this.denom);
		}
		else if(this.getDenom().compareTo(new BigInteger("0"))==0){
			return new Fraction(this.num.multiply(frac.getDenom()).add(frac.getNum()),frac.getDenom());
		}
		else if(frac.getDenom().compareTo(this.getDenom())==0){//when the denom is the same
			return new Fraction(frac.getNum().add(this.num),frac.denom);
		}
		else if(frac.getDenom().compareTo(this.denom)!=0){
			BigInteger newleftNum=frac.getDenom().multiply(this.num);
			BigInteger newrightNum=this.denom.multiply(frac.getNum());
			BigInteger newNumerator = newleftNum.add(newrightNum);
			
			return new Fraction(newNumerator,frac.getDenom().multiply(this.denom));
		}
		else return null;
	}
	
	public String getStringNumerator(){
		return this.num.toString();
	}
	public String getStringDenom(){
		return this.denom.toString();
	}

	public BigInteger getNum() {
		return num;
	}

	public void setNum(BigInteger num) {
		this.num = num;
	}

	public BigInteger getDenom() {
		return denom;
	}

	public void setDenom(BigInteger denom) {
		this.denom = denom;
	}
	
	public String toString(){
		return this.num.toString()+"/"+this.denom.toString();
	}

}
