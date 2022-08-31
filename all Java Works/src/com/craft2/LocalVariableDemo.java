package com.craft2;

public class LocalVariableDemo {
	
	public void methodOne() {
		int i = 10; // local variable
		System.out.println("The value of i:" + i);
		
	}
	
	public void methodTwo() {
		int k =30;
		System.out.println("The value of k:" +k);
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariableDemo M1 = new LocalVariableDemo();
		M1.methodOne();
		M1.methodTwo();

	}

}
