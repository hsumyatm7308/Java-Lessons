package javaclassandobject;

public class Book_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk = new Book();
		bk.setTitle("The book");
		bk.setEdition("the first edition");
		bk.setPublisher("Aye Aye");
		bk.setPrice(15000);
		System.out.println(bk.toString());
		
		Book bk1 = new Book("The book2","second edition","Kyaw Kyaw",8000);
		
		System.out.println(bk1.toString());

	}

}
