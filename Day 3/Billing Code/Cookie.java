package day3BillingCode;

public class Cookie extends Desert 
{
	public Cookie(double price, double quantity, String flavor) 
	{
		super(price, quantity, flavor);
	}

	@Override
	public double calculateBill() 
	{
		return (quantity/12)*price;
	}
}
