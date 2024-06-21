package day4.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class Library 
{
	List<Book> books;
	
	public Library(List<Book> books)
	{
		this.books = books;
	}
	
	public void addBook(Book b) throws DuplicateBookException
	{
		for(Book b1:books)
		{
			if(b.getIsbn() == b1.getIsbn())
			{
				throw new DuplicateBookException("Book Already Exists!");
			}
		}
		books.add(b);
	}
	public static void main(String[] args) 
	{
		List<Book> books = new ArrayList<>();
		books.add(new Book(123,"ABC","AAA"));
		books.add(new Book(456,"XYZ","BBB"));
		
		Library lib = new Library(books);
		try
		{
			lib.addBook(new Book(111,"DEF","CCC"));
		}
		catch (DuplicateBookException e)

		{
			System.out.println(e);
		}
	}
}
