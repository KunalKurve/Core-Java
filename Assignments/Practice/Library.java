package book;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book>books;
	public Library(List<Book>books) {
		this.books=books;
	}
	public void addBook(Book b)throws DuplicateBookException{
		for(Book bb:books) {
			if (bb.getIsbn()==b.getIsbn()) {
				throw new DuplicateBookException("book already exists");
			}
		}
		books.add(b);		
	}
public static void main(String[]args) {
	List<Book>books=new ArrayList<>();
	books.add(new Book(343453, "Java 8", "ruytru"));
	books.add(new Book(233445, "Java 11", "aafarg"));
	
	Library lib =new Library(books);
	try {
		lib.addBook(new Book(233445, "grit", "gyerteu"));
	}
	catch (DuplicateBookException e) {
		System.out.println(e);
	}
}


}
