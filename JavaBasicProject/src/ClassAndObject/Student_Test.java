package ClassAndObject;

public class Student_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("John");
		s1.setAge(20);
		s1.setStudentId("S001");
		Student s2 = new Student("Snow White",19,"S002");
		Student s3 = new Student("Gosling",21,"S003");
		s1.displayInfo();
		s2.displayInfo();
		s3.displayInfo();
		
	}

}
