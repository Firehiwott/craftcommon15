package Statement.Java;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In this example,  we are using break inside the innermost  loop. But the loop breaks each time when j is equal to 2 and control goes to outer loop that starts from the next iteration.
		
		for(int i=1;i<=2;i++){ 
			for (int j = 0; j <=3; j++) {
				if(j==2)
					break;
				System.out.println(j);
			}
		}

	}

}
