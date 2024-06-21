package Day5;

import java.util.Set;

public class Employee implements Comparable<Employee>
{
    int empid;
    String ename;
    double esal;
    Set<String> skills;

    public Employee(int empid, String ename, double esal, Set<String> skills)
    {
        this.empid = empid;
        this.ename = ename;
        this.esal = esal;
        this.skills = skills;
    }

    @Override
    public String toString()
    {
        return "Employee ID: "+empid+" Name: "+ename+" Salary: "+esal+" Skills: "+skills;
    }

@Override
    public int compareTo(Employee o)
    {
//        if (this.empid == o.empid)
//        {
//            return -1;
//        }
//        else
//        {
//            return 0;
//        }
        return this.empid-o.empid;
    }
}
