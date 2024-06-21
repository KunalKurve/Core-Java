package day3BillingCode;

public class Candy extends Desert
{
	public Candy(double price, double quantity, String flavor) 
	{
		super(price, quantity, flavor);
	}
	
	@Override
	public double calculateBill() 
	{
		return (quantity/1000)*price;
	}
}
