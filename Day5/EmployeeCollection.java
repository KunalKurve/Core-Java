package Day5;


import java.util.*;

public class EmployeeCollection
{
    public static Map<String, Set<String>> getSkilledEmployees(List<Employee> emplist)
    {
        Map<String,Set<String>> skillmap = new HashMap<>();
        for (Employee e: emplist)
        {
            if (e.skills.contains("Java"))
            {
                skillmap.put(e.ename,e.skills);
            }
        }
        return skillmap;
    }

    public static void main(String[] args)
    {
        Set<String> skills1 = new TreeSet<String>();
        skills1.add("Java");
        skills1.add("JavaScript");

        Set<String> skills2 = new TreeSet<String>();
        skills1.add("Python");
        skills1.add("Java");

        Set<String> skills3 = new TreeSet<String>();
        skills1.add("Java");
        skills1.add("R");

        List<Employee> lst = new ArrayList<>();
        lst.add(new Employee(2462,"Manasi",50000,skills1));
        lst.add(new Employee(680,"Kunal",60000,skills2));
        lst.add(new Employee(894,"Yogesh",40000,skills3));

        for (Employee e:lst)
            System.out.println(e);



        Collections.sort(lst);
        System.out.println("××××××××××××××××××××××××Sort by ID×××××××××××××××××××××");
        for (Employee e:lst)
        {
            System.out.println(e);
        }


        Collections.sort(lst);
        int found;
        found = Collections.binarySearch(lst, new Employee(555,null,0,null));
        System.out.println(found);

        Collections.sort(lst,new NameComparator());
        System.out.println("××××××××××××××××××××××××Sort by Name×××××××××××××××××××××");
        for (Employee e:lst)
        {
            System.out.println(e);
        }

        Map<String,Set<String>> skillmap = getSkilledEmployees(lst);
        System.out.println(skillmap);

        System.out.println("××××××××××××××××××××××××Sort by Salary×××××××××××××××××××××");
//        Map<String,Set<String>> skillmap2 = getSkilledEmployees(lst);
//        System.out.println(skillmap2);
    }
}
