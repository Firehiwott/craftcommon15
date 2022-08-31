package com.craft2;

public class InstanceVariableDemo {

	int age = 40; //instance variable
	
	
	public void methodOne() {
		int i = 10; // local variable
		System.out.println("The value of i:" + i);
		System.out.println("The value of age:"+ age);
	}
	
	public void methodTwo() {
		int k =30; //local variable
		System.out.println("The value of k:" +k);
		System.out.println("The value of age:"+age);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo F1 = new InstanceVariableDemo();
		F1.age =22;
		F1.methodOne();
		
		
		System.out.println("......................");
		
		InstanceVariableDemo F2 = new InstanceVariableDemo();
		F2.age =33;
		F2.methodOne();
		
		InstanceVariableDemo F3 = new InstanceVariableDemo();
		F3.methodOne();
		

	}

}
