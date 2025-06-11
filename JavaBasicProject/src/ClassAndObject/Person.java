package ClassAndObject;

public class Person {
	protected String name;
	protected int age;

	// Default Constructor
	public Person() {

	}

	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void displayInfo() {
		System.out.println(getName() + " is " + getAge() + " years old.");
	}
}
