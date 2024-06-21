package day3.Interface;

public class Consultant  extends ContractEmployee implements TaxPayers
{
	public Consultant(int empid, String name, double invoiceAmt) 
	{
		super(empid, name, invoiceAmt);	
	}

	
	@Override
	public String toString()
	{
		return super.toString()+" Gross: "+CalculateGross()+" Net: "+CalculateNet();
	}

	//10% of total invoice
	
	@Override
	public double calculateTax()
	{
		double tax=CalculateGross()*0.1;
		return tax;	
	}
	
	

}
