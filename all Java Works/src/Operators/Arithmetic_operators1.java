package Operators;

public class Arithmetic_operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		a=10;
		b=2;
		c=a+b;
		System.out.println("Addtion: "+c);
		
		c=a-b;
		System.out.println("Substraction: "+c);
		
		c=a*b;
		System.out.println("Multiplication: "+c);
		
		c=a/b;
		System.out.println("Division: "+c);
		
		b=2;
		c=a%b;
		System.out.println("Remainder: "+c);
		
	//	a=++a; // a=11
		c= a++; // a=10 c=11
		System.out.println("Increment Operator: "+c);
		System.out.println("Increment Operator: "+a);
		
    //	a=--a; // b=10
		int d= a--;  //d=11 a=10
		System.out.println("decrement Operator: "+d);
		System.out.println("Increment Operator: "+a);

	}

}
