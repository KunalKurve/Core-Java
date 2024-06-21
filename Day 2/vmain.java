package day2;

public class vmain 
{
	public static void main(String [] args)
	{
		Vehicle obj1 = new Vehicle();
		System.out.println(obj1.toString());
		System.out.println("Total Vehicle Count: " + Vehicle.displayCount());
		System.out.println();
		Vehicle obj2 = new Vehicle("Himesh", "Lambourgini", 40, "Auto");
		System.out.println(obj2.toString());
		System.out.println("Total Vehicle Count: " +Vehicle.displayCount());
		
		
	}
	
	

}
