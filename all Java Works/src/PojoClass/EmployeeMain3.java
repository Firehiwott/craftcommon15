package PojoClass;

import java.util.HashMap;

public class EmployeeMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee>  hm1 = new HashMap();
		Employee emp1 = new Employee();
	
		emp1.setEmpid(100);
		emp1.setEmpname("Hanif");
		emp1.setEmpsalary(30000.56);
		hm1.put(100,emp1);
		
		Employee  emp2 = new Employee();
		emp2.setEmpid(200)
		;emp2.setEmpname("Mohammed Iqbal");
		emp2.setEmpsalary(15000.67);
		hm1.put(200, emp2);
		
		Employee e2 = hm1.get(200);
		System.out.println(e2.getEmpid()+" "+e2.getEmpname()+ " "+e2.getEmpsalary());

	}

}
