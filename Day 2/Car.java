package day2;

public class Car {

	private String make;
	private String model;
	private double price;
	private int man_year;
//	private int count = 0; // it will get reset to ZERO as we create a new object
	private static int count = 0; // create static of it
	
	//default
			public Car()
			{
//				make = "Honda";
//				model = "City";
//				price = 150000;
//				man_year = 2222;
				this("Honda", "City", 150000, 2222);
						
				
			}

		//Parameterized Constructor
			public Car(String make, String model, double price, int man_year)
			{
				count++;
			}
	
			public String get_Price() {
				return "Price is : " + price;
			}
			

}
