package Operators;

public class Conditional_operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a, b;
		a = 20;
		b = (a == 1) ? 30: 40;
		System.out.println( "Value of b is : " +  b );
		b = (a == 20) ? 30: 40;
		System.out.println( "Value of b is : " + b );
		
		*/
		
		int age = 20;
		String output;
		
		if(age>=18) {
		output ="you are in";
		}
		
		else {
			output = "you are not in";
		}
		
		System.out.println(output);
		
		String result;
		result = (age>=18)? "you are in":"you are not in";
		System.out.println(result);

	}

}
