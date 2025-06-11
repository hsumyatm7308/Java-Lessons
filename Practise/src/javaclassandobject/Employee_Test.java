package javaclassandobject;

public class Employee_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String emp_id,String emp_name,double emp_salary,String emp_department
		Employee emp1 = new Employee();
		emp1.setEmpId("E7876");
		emp1.setName("ADAMS");
		emp1.calculate_emp_salary(5000,50);
		emp1.assign_department("ACCOUNTING");
		System.out.println(emp1.print_employee_details());
		
		Employee emp2 = new Employee();
		emp2.setEmpId("E7499");
		emp2.setName("JONES");
		emp2.calculate_emp_salary(5000,50);
		emp2.assign_department("RESEARCH");
		System.out.println(emp2.print_employee_details());
		
		Employee emp3 = new Employee();
		emp3.setEmpId("E7900");
		emp3.setName("MARTIN");
		emp3.calculate_emp_salary(50000,50);
		emp3.assign_department("SALES");
		System.out.println(emp3.print_employee_details());
	}

}
