package Operators;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Loop can be nested, loop created inside another loop is called nested loop. 
		 Sometimes based on the requirement, we have to create nested loop.
		 ▪Generally, nested loops are used to iterate tabular data.
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("i ");	
			}
			System.out.println();
		}

	}

}
