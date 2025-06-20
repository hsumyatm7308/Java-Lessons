package exceptionhandling;

public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person() {}
	public Person(String n,int age,String email) {
		this.name = n;
		this.age = age;
		this.email = email;
	}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void registerUser(String name, int age)throws EmptyNameException,InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("age must be over 18");
		}
		if(name.isEmpty()) {
			throw new EmptyNameException("Name is Empty");
		}
		

	}
	
	public String toString() {
		return "Name : " + getName() + " Age :" + getAge() + " Email : " + getEmail();
	}
}
