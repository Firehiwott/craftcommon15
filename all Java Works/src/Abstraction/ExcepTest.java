package Abstraction;

public class ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=10, b=0;
//		
//		System.out.println(a/b);
		try {
			int[] arr = new int[5];
			arr[5]= 10;
			
			
			int a=10, b=0;
			System.out.println(a/b);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//		}
		finally {
			System.out.println("finally...");
		}

	}

}
