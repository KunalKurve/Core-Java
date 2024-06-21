package day3.Interface;

import day3.Employee;

public class ContractEmployee extends Employee
{
	protected double invoiceAmt;
	public ContractEmployee(int empid, String name, double invoiceAmt) 
	{
		super(empid, name);
		this.invoiceAmt = invoiceAmt;
		
	}

	@Override
	public double CalculateGross() 
	{
		
		double hra = invoiceAmt*0.4;
		double da = invoiceAmt*0.12;
		return invoiceAmt+hra+da;
	}

	@Override
	public double CalculateNet() 
	{
		double tax = CalculateGross()*0.2;
		return CalculateGross()-tax;
	}
	
	
	@Override
	public String toString()
	{
		return super.toString()+" Gross: "+CalculateGross()+" Net: "+CalculateNet();
	}

	
}
