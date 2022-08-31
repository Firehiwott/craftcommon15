package com.craft2;

public class CastWidening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
       ▪Automatic Type casting take place when,
       ▪the two types are compatible
       ▪the target type is larger than the source type
       */
		
		/*
		int i = 100;
		long l = i; //no explicit type casting required
		float f = l;  //no explicit type casting required
		System.out.println("Int value "+i);
		System.out.println("Long value "+l);
		System.out.println("Float value "+f);
		*/
		
		double d = 120.04;  
		long l = (long)d;  
		int i = (int)l;  
		System.out.println("Double value "+d);
		System.out.println("Long value "+l);  
		System.out.println("Int value "+i);  	
		
		
		
	}
}
