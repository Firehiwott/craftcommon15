package com.craft2;

public class StaticVariableDemo {
	public static double salary;
	public static String dept = "Finance";
	
	public static void main(String[]args) {
		salary = 1000;
		System.out.println("Dept:" + dept);
		System.out.println("Salary" + salary);
	}

}



