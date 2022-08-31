package ExceptionInJava;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String name = null;
			name.length();
			
			int[] arr= new int[5];
			arr[5] = 10;
			
			int a = 20/0;	
		}
		catch(Exception ex) { // for all catch we need to used Exception
		}
//		catch(ArithmeticException ex) {
//			System.out.println("aritimitic exception handling");
//			System.out.println(ex.getMessage());
//	
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//		}
//		catch(NullPointerException ex ) {
//			
//		}
		
		finally {
			System.out.println("all Exception in the finally block");
			
		}
		
		System.out.println("all Exception");
		
		
		
		

	}
	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("not valid");
		}
	}

}
