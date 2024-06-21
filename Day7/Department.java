package Day7;

public class Department
{
    public String dept;
    public String name;

    public Department(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public String getName() {
        return name;
    }

    public String toString()
    {
        return "Department: "+dept+", Name: "+name;
    }
}
