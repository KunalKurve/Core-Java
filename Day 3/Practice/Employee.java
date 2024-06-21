package day3;

public abstract class Employee 
{
	protected int empid;
    protected String name;

    public Employee(int empid, String name)
    {
        this.empid = empid;
        this.name = name;
    }

    public abstract double CalculateGross();
    public abstract double CalculateNet();
    
    public String toString()
    {
        return "Employee ID: "+empid+" Name: "+name;
    }
}
