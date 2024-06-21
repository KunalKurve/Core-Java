package day3;

import day3.Interface.TaxPayers;

public class SalariedEmployee extends Employee implements TaxPayers
{
	protected double basic;
	public SalariedEmployee(int empid, String name, double basic)
	{
		super(empid,name);
		this.basic = basic;
	}
	
	@Override
	public double CalculateGross() 
	{
		double hra = basic*0.4;
		double da = basic*0.12;
		return basic+hra+da;
	}
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

	@Override
	public double calculateTax()
	{
		double tax=CalculateGross()*0.3;
		return tax;	
	}
}
