package day2;

public class DemoArray 
{
	
		public static void main(String[] args)
		{
			Car[] cars = new Car[2];
		
			cars[0] = new Car();
			cars[1] = new Car("xyz", "abc", 1000, 5000);
			System.out.println(cars[0].get_Price());
			System.out.println(cars[1].get_Price());
			
			//for(datatype var: collection)
			
			for(Car C : cars)
			{
				System.out.println(C);
			}
			
			System.out.println("\n******************************(:*************************************");
			
			
			
			
		}
	

}
