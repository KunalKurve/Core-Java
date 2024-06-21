package day4.ExceptionHandling;

public class DuplicateBookException extends Exception
{
	public DuplicateBookException(String msg) 
	{
		super(msg);
	}
}
