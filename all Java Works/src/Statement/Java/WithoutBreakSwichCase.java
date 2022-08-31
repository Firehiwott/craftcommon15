package Statement.Java;

public class WithoutBreakSwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Break statement is used to break the current execution of the program. 
		//In switch case, break is used to terminate the switch case execution and transfer control to the outside of switch case.
		
		String name = "Mango"; 
		switch(name){ 
		case "Mango": 
			System.out.println("It is a fruit"); 
		case "Tomato": 
				System.out.println("It is a vegitable"); 
		case "Coke":
				System.out.println("It is cold drink");  
		}

	}

}
