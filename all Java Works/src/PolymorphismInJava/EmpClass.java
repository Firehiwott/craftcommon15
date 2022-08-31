package PolymorphismInJava;

//Static variables examples
public class EmpClass {
	static String city="New York";
	 String  name = "Mohammed Ismail";
	 int age = 30;


	public class staticClassMain1{
		public static void main(String[]args) {
			// Referring to variables without creating object
			System.out.println("city:"+ EmpClass.city);
			
			//System.out.println("name:"+ EmpClass.name);
			 
			//System.out.println("age:"+ EmpClass.age);
			
			EmpClass   emp1 = new EmpClass();
			System.out.println("city:"+emp1.city);   // EmpClass.city
			System.out.println("name:"+emp1.name);
			System.out.println("age:"+emp1.age);
			
			System.out.println("----------------------");
			EmpClass  emp2 = new EmpClass();
			System.out.println("city:"+emp2.city); // EmpClass.city
			System.out.println("name:"+emp2.name);
			System.out.println("age:"+emp2.age);
			
	
			
			
			
			
			
			
		}	
	}
}
