package day3BillingCode;

public class IceCream extends Desert
{
	public IceCream(double price, double quantity, String flavor) 
	{
		super(price, quantity, flavor);
	}

	@Override
	public double calculateBill() 
	{
		return price*quantity;
	}
}
