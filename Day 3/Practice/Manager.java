package day3;

public class Manager extends SalariedEmployee
{
	protected static int ta=1500;
	
	public Manager(int empid, String name, double basic) 
	{
		super(empid, name, basic);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double CalculateGross()
	{
		return super.CalculateGross()+ta;
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
}
