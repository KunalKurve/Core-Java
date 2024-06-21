package day3BillingCode;

import java.util.Scanner;

public class BillingPortal 
{
/*
 * Bill Portal: 
 * 1. Ice-cream
 * 2. Cookie
 * 3. Candy 
 * 
 * Quantity
 * Rate
 * Price
 * Total Bill 
 * 
 * first page :  1. 
 * 
 */

	
	public static void main(String [] args)
	{
		int ch=0;
		String f;
		double p,q;
		Desert ds;
		CartItems cart = new CartItems();
		Scanner sc = new Scanner(System.in);
		
		while (ch != 4)
		{
			System.out.println("""
					1. Candy
					2. Cookie
					3. Ice-cream
					4. Exit
					Enter Choice: """);
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1: 
				System.out.println("Enter Flavor: ");
				f = sc.next();
				System.out.println("Enter Price: ");
				p = sc.nextInt();
				System.out.println("Enter Quantity: ");
				q = sc.nextInt();
				ds = new Candy(p, q, f);
				cart.calcBill(ds);
				break;
				
			case 2:
				System.out.println("Enter Flavor: ");
				f = sc.next();
				System.out.println("Enter Price: ");
				p = sc.nextInt();
				System.out.println("Enter Quantity: ");
				q = sc.nextInt();
				ds = new Cookie(p, q, f);
				cart.calcBill(ds);	
				break;
					
			case 3:
				System.out.println("Enter Flavor: ");
				f = sc.next();
				System.out.println("Enter Price: ");
				p = sc.nextInt();
				System.out.println("Enter Quantity: ");
				q = sc.nextInt();
				ds = new IceCream(p, q, f);
				cart.calcBill(ds);
				break;
				
				
			case 4:
				cart.showBill();
				System.out.println("Thank You");
				cart.resetBill();
				break;
				
			default:
				System.out.println("Invalid Choice. Enter Again!");
			}
		}
		
	}

}
