package ClassAndObject;

public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st = new Student1();
		st.setName("Aung Aung");
		st.setAge(12);
		
		
		Student1 st2 = new Student1("Kyaw Kyaw",20,"WDF7308");
		
		st.displayInfo();
		st2.displayInfo();

	}

}
