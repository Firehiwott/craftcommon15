package PolymorphismInJava;

public class EmployeeClassMain2 {
	//Static methods Example
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpClass2.getEmpDetails(); //  Allowed to call without object creation 
		//EmpClass2.printEmpDetails();   // Not Allowed
		EmpClass2 emp2 = new EmpClass2();
		emp2.printEmpDetails();   // Allowed after creating object

	}

}
