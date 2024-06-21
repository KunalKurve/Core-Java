package day4.ExceptionHandling;

public class NewMath 
{
	public static void divide (String str1, String str2) throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException //just explicitly telling what exceptions this Try method might give
	{ //  throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException - its not a necessary statement
		//throws is mandatory in case of checked exceptions
		int dividend = Integer.parseInt(str1);
		int divisor = Integer.parseInt(str2);
	
		int q = dividend/divisor;
		System.out.println(q);
		
		//developer doesn't wanna handle exception ----- ;} developer being lazy
		
		
		//if main handles then no exception will be thrown
		
	}
	public static void main(String[] args) {
		
		
		try
		{
			divide(args[0], args[1]);
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
		System.out.println("After Exception");
}
}
