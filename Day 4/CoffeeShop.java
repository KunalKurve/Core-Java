package day4;

import java.util.Scanner;

public class CoffeeShop 
{
	public static void main (String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("-------------Menu-------------");
			Coffee [] coffees = Coffee.values();
			for (Coffee cof: coffees)
			{
				System.out.println(cof);
			}
			System.out.println("--------------------------------");
			System.out.println("Enter your choice: Small/Medium/Large: ");
			String choice = sc.next();
			System.out.println("Enter Quantity: ");
			int qty = sc.nextInt();
			//Coffee c = Coffee.SMALL;
			Coffee c = Coffee.valueOf(choice.toUpperCase());
			switch (c)
			{
				case SMALL:
					System.out.println("Bill: "+qty*c.getPrice());
					break;
				case MEDIUM:
					System.out.println("Bill: "+qty*c.getPrice());
					break;
				case LARGE:
					System.out.println("Bill: " + qty*c.getPrice());
					break;
			}
		}
		
	}
}
