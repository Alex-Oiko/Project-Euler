package SquareRootConv;

import java.math.BigInteger;

public class SquareRootConvMain {
	
	public static void main(String[] args){
		//Fractions testing
		
		/*Fraction f = new Fraction(new BigInteger("3"),new BigInteger("2"));
		f=f.add(new Fraction(new BigInteger("5"),new BigInteger("2")));
		System.out.println(f);
		
		Fraction f1 = new Fraction(new BigInteger("3"),new BigInteger("0"));
		f1=f1.add(new Fraction(new BigInteger("3"),new BigInteger("2")));
		System.out.println(f1);
		
		Fraction f2 = new Fraction(new BigInteger("9"),new BigInteger("2"));
		f2=f2.add(new Fraction(new BigInteger("5"),new BigInteger("0")));
		System.out.println(f2);
		Fraction f3 = new Fraction(new BigInteger("3"),new BigInteger("4"));
		f3=f3.add(new Fraction(new BigInteger("4"),new BigInteger("7")));
		System.out.println(f3);*/
		int counter=0;
		
		for(int i=0;i<1000;i++){
			Fraction f = addNextStep(i);
			if(isNumeratorMoreThanDenom(f.getStringNumerator(), f.getStringDenom()))
				counter++;
		}
		System.out.println("Result is "+counter);
	}
	public static boolean isNumeratorMoreThanDenom(String num,String denom){
		if(num.length()>denom.length())
			return true;
		else return false;
	}
	
	public static Fraction addNextStep(int n){
		if(n==1){
			return new Fraction(new BigInteger("1"),new BigInteger("2")).add(new Fraction(new BigInteger("1"),new BigInteger("0")));//1+1/2
		}
		
		Fraction firstStep = new Fraction(new BigInteger("1"),new BigInteger("2")).add(new Fraction(new BigInteger("2"),new BigInteger("0")));//2+1/2
		Fraction two = new Fraction(new BigInteger("2"),new BigInteger("0"));//2
		Fraction prevStep = firstStep;
		for(int i=1;i<n-1;i++){
			Fraction nextStep = new Fraction(prevStep.getDenom(),prevStep.getNum()).add(two);
			prevStep = nextStep;
			//System.out.println(firstStep);
		}
		return new Fraction(new BigInteger("1"),new BigInteger("0")).add(new Fraction(prevStep.getDenom(),prevStep.getNum()));
	}

}
