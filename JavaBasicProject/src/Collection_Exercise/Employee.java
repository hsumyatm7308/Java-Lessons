package Collection_Exercise;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	
	public Employee() {}
	public Employee(int id,String n, double s) {
		this.eid= id;
		this.name = n;
		this.salary = s;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "ID " + getEid() + " Name: " + getName() +  " Salary: " + getSalary();
	}
	
	
}
