package ClassAndObject;

public class Book {
	private String b_name;
	private Author a; //is that call from author class ? // user defind data type 

	public Book() {

	}

	/**
	 * @param b_name
	 * @param a
	 */
	public Book(String b_name, Author a) {
		this.b_name = b_name;
		this.a = a;
	}

	/**
	 * @return the b_name
	 */
	public String getB_name() {
		return b_name;
	}

	/**
	 * @param b_name
	 *            the b_name to set
	 */
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	/**
	 * @return the a
	 */
	public Author getA() {
		return a;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(Author a) {
		this.a = a;
	}

	public String toString() {
		return "Book Name is " + this.getB_name() + " " + a.toString(); // a.toString() ka bal ka nay youte tar lal ?? and bar loh this.getB_name() thone thar lal
	}

}
