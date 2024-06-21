package day3;

public class SalesManager extends Manager
{
	protected double incentive;
	
	public SalesManager(int empid, String name, double basic, double incentive) 
	{
		super(empid, name, basic);
		this.incentive = incentive;
	}
	
	@Override
	public double CalculateGross()
	{
		return super.CalculateGross()+incentive;
	}
	
	@Override
	public double CalculateNet()
	{
		double tax=CalculateGross()*0.3;
		return super.CalculateNet()+tax;
	}
	
	
}	
