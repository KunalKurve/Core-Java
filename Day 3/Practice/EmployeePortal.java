package day3;

public class EmployeePortal 
{
	public void showGrossSal(Employee e)		// e is a variable of type employee, i.e., e is a reference.
	{
		System.out.println("Gross Salary: "+e.CalculateGross());
	}
	
	public void showNetSal(Employee e)		// e is a variable of type employee, i.e., e is a reference.
	{
		System.out.println("Net Salary: "+e.CalculateNet());
	}
	
	public static void main(String [] args)
	{
		EmployeePortal portal = new EmployeePortal();
		SalariedEmployee esal = new SalariedEmployee(556,"Salaried Employee",10);
		System.out.println(esal);
		portal.showGrossSal(esal);
		portal.showNetSal(esal);
		
		Manager m = new Manager(432,"Manager",8000);
		System.out.println(m);
		
		Employee [] emp = new Employee[3];
		emp[0] = new SalesManager(222,"Sales Manager 1",1000,2000);
		emp[1] = new SalesManager(333,"Sales Manager 2",3000,4000);
		emp[2] = new SalesManager(444,"Sales Manager 3",5000,6000);
		
		for (Employee e:emp)
		{
			portal.showGrossSal(e);
			if (e instanceof SalariedEmployee)
			{
				SalariedEmployee ss = (SalariedEmployee)e;	//down casting
				portal.showNetSal(ss);
				
				if (ss instanceof SalesManager)
				{
					SalesManager sm = (SalesManager)ss;
					portal.showNetSal(sm);
				}
			}
		}
	}
}