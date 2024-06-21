package day3BillingCode;

public abstract class Desert 
{
	protected double price;
	protected double quantity;
	protected String flavor;
	
	public Desert(double price, double quantity, String flavor)
	{
		this.price = price;
		this.quantity = quantity;
		this.flavor = flavor;
	}
	
	public abstract double calculateBill();	
}
