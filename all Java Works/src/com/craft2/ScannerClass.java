package com.craft2;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter your first name");
		String firstName = in.next();
		
		System.out.println("pls enter your last name");
		String lastName = in.next();
		
		System.out.println("pls enter your roll number");
		int rollNo  = in.nextInt();
		
		System.out.println("pls enter your age");
		int age = in.nextInt();
		
		System.out.println("pls enter your salary");
		double salary = in.nextDouble();
		
		System.out.println("pls enter your gender");
		char gender = in.next().charAt(0);
		

	}

}
