package ClassAndObject;

public class Student1 extends Person {
	private String studentId;
	
	Student1(){
		
	}
	
	Student1(String n, int a, String id){
		super.name = n;
		super.age = a;
		this.studentId = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void displayInfo() {
		System.out.println("ID: " + getStudentId());
		super.displayInfo();
	}
	
	
}
