package Collection_Exercise;

public class Book {
		private String ISBN;
		private String title;
		private String author;
		private boolean isIssued;
		
		public Book(){}
		public Book(String ISBN, String title, String author) {
			this.ISBN = ISBN;
			this.title = title;
			this.author = author;
			this.isIssued = false;
		}
		public String getISBN() {
			return ISBN;
		}
		public void setISBN(String iSBN) {
			this.ISBN = iSBN;
		}
		

		public boolean isIssued() {
			return isIssued;
		}
		public void setIssued(boolean isIssued) {
			this.isIssued = isIssued;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public String toString() {
			return "ISBN " +  getISBN() + "Title " +  getTitle() + "Author " +  getAuthor();
		}

}
