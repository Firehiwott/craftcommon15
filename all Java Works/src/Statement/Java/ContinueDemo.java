package Statement.Java;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 In this example, we are using continue statement inside the for loop. 
		 See, it does not print 5 to the console because at fifth iteration continue statement skips the iteration that’s why print statement does not execute.
		 */
		
		for(int i=1;i<=10;i++){
			if(i==5){
				continue;
				}  
			System.out.println(i);  
		}
		

	}

}
