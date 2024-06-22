package book;

public class Book {
	private int isbn;
	private String name;
	private String author;
	
	public Book(int isbn,String name,String author) {
		this.isbn=isbn;
		this.name=name;
		this.author=author;
	}
	
	public int getIsbn() {
		return this.isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn=isbn;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String toString() {
		return "Book[isbn=" +isbn+",name="+name+",author="+author+"]";
	}
}
