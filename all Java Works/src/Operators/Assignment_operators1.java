package Operators;

public class Assignment_operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 10;
		int c = 0;
		
		c = a + b;
		System.out.println("c= a+b = "+c); // c=40
		
		c += a;
		System.out.println("c +=a ="+c); // c=70
		
		c -= a;
		System.out.println("c -=a ="+c);
		
		c *= a;
		System.out.println("c *=a ="+c);
		
		a =20;
		c = 25;
		c%= a;
		System.out.println("c%= a ="+c);

	}

}
