package Statement.Java;

public class ContinueInWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 continue statement can be used with while loop to manage the flow control of the program. 
		 As we already know continue statement is used to skip the current iteration of the loop. 
		 Here too, it will skip the execution if the value of variable is 5
		 */
		
		int i=1;
		while (i < 10) {
			if (i == 5) {
				i++;
				continue;
				}
			System.out.println(i);i++;
		}

	}

}
