package ClassAndObject;

public class Book_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("James Gosling",57);
		Book b1 = new Book("Learn to Java",a1);
		System.out.println(b1.toString());
		
		Author a2 = new Author();
		a2.setName("Smith");
		a2.setAge(48);
		
		Book b2 = new Book();
		b2.setB_name("Python Programming");
		b2.setA(a2);
		System.out.println(b2.toString());
	}

}
