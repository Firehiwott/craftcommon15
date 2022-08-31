package Polymorphism;

public class privateInfo2 {
	public static void main(String[]args) {
		PrivateInfo emp = new PrivateInfo();
		
		emp.setEmpId(104);
		emp.setEmpFirstName("Hana");
		emp.setEmpLastName("Abebe");
		emp.setEmpSalary(160000);
		
		
		System.out.println("private Information");
		
		System.out.println("Private Id:" + emp.getEmpId());
		System.out.println("Private firstName:" + emp.getEmpFirstName());
		System.out.println("Private lastName:" + emp.getEmpLastName());
		System.out.println("Private salary:" + emp.getEmpSalary());
	
		
		
	}

}
