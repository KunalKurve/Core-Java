package Day7;

import java.util.Set;

public class Employee implements Comparable<Employee>
{
    int empid;
    String ename;
    double esal;
    Set<String> skills;
    String edept;

    public Employee(int empid, String ename, double esal, Set<String> skills, String edept)
    {
        this.empid = empid;
        this.ename = ename;
        this.esal = esal;
        this.skills = skills;
        this.edept = edept;
    }

    public String getEname() { return ename; }

    public String getEdept() { return edept; }

    public int getEmpid() {
        return empid;
    }

    public double getEsal() {
        return esal;
    }

    public Set<String> getSkills() {
        return skills;
    }

    @Override
    public String toString()
    {
        return "Employee ID: "+empid+", Name: "+ename+", Department: "+edept+", Salary: "+esal+", Skills: "+skills;
    }

    @Override
    public int compareTo(Employee o)
    {
        return 0;
    }
}
