package PojoClass;

import java.util.ArrayList;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee>  list = new ArrayList();
		
		Employee emp1 = new Employee();
		emp1.setEmpid(100);
		emp1.setEmpname("Hanif");
		emp1.setEmpsalary(30000.56);
		list.add(emp1);
		
		Employee  emp2 = new Employee();
		emp2.setEmpid(200);
		emp2.setEmpname("Mohammed Iqbal");
		emp2.setEmpsalary(15000.67);
		
		list.add(emp2);
		
		System.out.println(emp1.getEmpid()+" "+emp1.getEmpname()+ " "+emp1.getEmpsalary());
		System.out.println(emp2.getEmpid()+" "+emp2.getEmpname()+ " "+emp2.getEmpsalary());
		
		
		for(Employee e1:list){
			System.out.println(e1.getEmpid()+"     "+e1.getEmpname()+ " "+e1.getEmpsalary());
			}

	}

}
