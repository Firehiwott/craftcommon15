package PolymorphismInJava;
// Static methods Example
public class EmpClass2 {
	static String myname= "Daniel kafele";
	static int age= 24;
	int salary = 20000;
	public static void getEmpDetails(){
		System.out.println("Name: "+ myname);
		System.out.println("Age: "+ age);
		//System.out.println("Salary: "+ salary);  
		}
		
		public  void printEmpDetails(){
			System.out.println("Name: "+ myname);
			System.out.println("Age: "+ age);
			System.out.println("Salary: "+ salary);
			}
	//	}
//public class EmployeeClassMain2 {
	public static void main(String[] args) {
		EmpClass2.getEmpDetails();  //  Allowed to call without object creation 
		//EmpClass2.printEmpDetails();   // Not Allowed 
		
	}

}
