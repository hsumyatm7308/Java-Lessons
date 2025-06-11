package javaclassandobject;

public class Employee {
	private String EmpId;
	private String name;
	private double salary;
	private String department;

//	public Employee(String emp_id,String emp_name,double emp_salary,String emp_department) {
//		this.EmpId = emp_id;
//		this.name = emp_name;
//		this.salary = emp_salary;
//		this.department = emp_department;
//	}
	public Employee() {
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}


	public void calculate_emp_salary(double salary, double hours_worked) {
		double overtime = hours_worked - 50;
		double overtime_amount = overtime * (salary / 50);
		if (salary > 50) {
			this.salary = salary + overtime_amount;
		} else {
			this.salary = salary;
		}

 
	}

	public String getDepartment() {
		return department;
	}
	
	public void assign_department(String department) {
		this.department = department;
	}

	public String print_employee_details() {
		return   getName()+ "," + getEmpId()   + "," + getSalary() + "," + getDepartment();
	}

}
