package com.craft2;

public class CastNarrowing {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* When you are assigning a larger type value to a variable of smaller type, then you need to perform explicit type casting. 
		If we don't perform casting then compiler reports compile time error.
		*/
		double d = 100.04;
		long l = (long)d;  //explicit type casting required
		int i = (int)l; //explicit type casting required
		
		System.out.println("Double value "+d);
		System.out.println("Long value "+l);
		System.out.println("Int value "+i);


	}

}
