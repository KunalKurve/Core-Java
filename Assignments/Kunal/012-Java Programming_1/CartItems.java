package day3BillingCode;

public class CartItems 
{		
	double totalAmount = 0;
	int count = 0;
	
	public void calcBill(Desert d)
	{
		totalAmount = totalAmount + d.calculateBill();
		count++;
	}
	
	public void showBill()
	{
		System.out.println("Items Bought= "+count+"\nTotal Amount= "+totalAmount);
	}
	
	public void resetBill()
	{
		totalAmount = 0;
		count = 0;
	}
}
