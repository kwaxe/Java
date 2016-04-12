
public class Book extends SalesItem {
	
	private String author;
	private int numPages;

	public Book(int code, String title, double price, int quantity, String author, int numPages) {
		super(code, title, price, quantity);
		this.author = author;
		this.numPages = numPages;	
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		String str = "";
		str += "Author: " + author + "\n";
		str += "Pages: " + numPages + "\n";
		return str;
	}
	
	


	

}
