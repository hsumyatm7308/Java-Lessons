package javaclassandobject;

public class Worker {
	protected String name;
	protected int age;
	protected String gender;
	protected double salary;
	
	public Worker() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		if(getGender().equals("female")) {
			return "Name : Daw " + getName() +" Age : " + getAge() +" Gender : " + getGender() + " Salary :" + getSalary();
		}else {
			return "Name : U " + getName() +" Age : " + getAge() +" Gender : " + getGender() + " Salary :" + getSalary();
		}
	}
	

}
