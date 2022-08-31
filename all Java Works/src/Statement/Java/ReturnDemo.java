package Statement.Java;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 The following example illustrates this point.
		  In below program main () is calling method and checkEven() is called the method. Execution of checkEven() method ends when return statement encountered.
		 */
		for (int k =25; k< 31; k++){
			new ReturnDemo().checkEven(k);
			}
		}
	public boolean checkEven(int a){
		if (a%2 == 0){
			System.out.println(a + " is even number");
			return true;
			}
		System.out.println(a + " is odd number");
		return false;

	}

}
