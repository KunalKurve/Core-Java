package day4.ExceptionHandling;

public class Math {

	public static void main(String[] args) {
		try
		{
			int dividend = Integer.parseInt(args[0]);
			int divisor = Integer.parseInt(args[1]);
			
			int q = dividend/divisor;
			System.out.println(q);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		catch (Exception e) //for all the unknown errors
		{ 
			System.out.println(e);
		}
		finally{
			System.out.println("After Execution");
		}
		System.out.println("After Exception");
	}
}
	
	//Checked type of exceptions 
	
//	IO Exceptions  and SQL type exceptions
	
	//Unchecked exceptions
	
	// Arithmetic, NullPointer, NumberFormat
	
	
	//Error - VirtualMachine, - sometimes some methods do not give exceptions when they should
	

	//Automatic resource manager
	//File f = new File();
	//FileInputStre, fin = new FileinputStream(f)
	//So Java can't decide when the usage of resource is over.
	//resource is memory. Memory leakage.
	//when should this close be written
	//eg. Scanner
	//therefore there is a finally block
	// to execute some code after try block...which we want to execute anyway.
	
	//in python it is : with method which hanles it internally by using Context manager
