package javaclassandobject;

public class Book {

	private String title;
	private String edition;
	private String publisher;
	private float price;
	public Book() {}

	public Book(String t,String ed,String pb,float p) {
		this.title = t;
		this.edition = ed;
		this.publisher = pb;
		this.price = p;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
	return 	"Title : "  + getTitle() + " Edition : " + getEdition() + " Publisher : " + getPublisher() + " Price : " + getPrice();
	}

}
