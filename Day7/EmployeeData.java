package Day7;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData
{
    public static List<Employee> getEmployee()
    {
        Set<String> skills1 = new TreeSet<String>();
        skills1.add("Java");
        skills1.add("JavaScript");

        Set<String> skills2 = new TreeSet<String>();
        skills2.add("Python");
        skills2.add("Java");

        Set<String> skills3 = new TreeSet<String>();
        skills3.add("Java");
        skills3.add("R");

        List<Day7.Employee> lst = new ArrayList<>();
        lst.add(new Day7.Employee(2462, "Manasi", 50000, skills1, "Legal"));
        lst.add(new Day7.Employee(680, "Kunal_K", 60000, skills2,"Legal"));
        lst.add(new Day7.Employee(894, "Yogesh", 40000, skills3,"Accounts"));
        lst.add(new Day7.Employee(312, "Osheen", 100000, skills1, "Accounts"));
        lst.add(new Day7.Employee(612, "Shrinivas", 70000, skills2,"HR"));
        lst.add(new Day7.Employee(612, "Kunal_U", 80000, skills3,"HR"));

//        for (Employee e : lst)
//            System.out.println(e);

        return lst;
    }
    public static void main(String[] args)
    {
        List<Employee> emplist = getEmployee();
        Stream<Employee> estream = emplist.stream();

        estream.forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××SORT BY ID××××××××××××××××××××××\n");
        estream = emplist.stream();
        estream.sorted().forEach(System.out::println);


        System.out.println("\n×××××××××××××××××××××SORT BY NAME××××××××××××××××××××××\n");
        estream = emplist.stream();
        Comparator<Employee> byName = Comparator.comparing(Employee::getEname);
        estream.sorted(byName).forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××SORT BY DEPARTMENT××××××××××××××××××××××\n");
        estream = emplist.stream();
        Comparator<Employee> byDept = Comparator.comparing(Employee::getEdept).thenComparing(byName);
        estream.sorted(byDept).forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××DEPARTMENT WISE EMPLOYEE LIST××××××××××××××××××××××\n");
        Function<Employee,Department> deptList = emp -> new Department(emp.getEname(), emp.getEdept());
        estream = emplist.stream();
        estream.map(deptList).forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××EMPLOYEE LIST WITH SKILLS - JAVA××××××××××××××××××××××\n");
        estream = emplist.stream();
        Predicate<Employee> skillList = (emp) -> emp.getSkills().contains("Java");
        estream.filter(skillList).forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××EMPLOYEE LIST WITH SALARY >60000××××××××××××××××××××××\n");
        estream = emplist.stream();
        Predicate<Employee> salrange = (emp) -> emp.getEsal()>60000;
        estream.filter(salrange).forEach(System.out::println);

        System.out.println("\n×××××××××××××××××××××MINIMUM SALARY××××××××××××××××××××××\n");
        estream = emplist.stream();
        OptionalDouble min = estream.mapToDouble(Employee::getEsal).min();
        if (min.isPresent()) {
            System.out.println("Minimum Salary: "+min.getAsDouble()); }

        System.out.println("\n×××××××××××××××××××××MAXIMUM SALARY××××××××××××××××××××××\n");
        estream = emplist.stream();
        OptionalDouble max = estream.mapToDouble(Employee::getEsal).max();
        if (max.isPresent()) {
            System.out.println("Maximum Salary: "+max.getAsDouble()); }

        System.out.println("\n×××××××××××××××××××××AVERAGE SALARY××××××××××××××××××××××\n");
        estream = emplist.stream();
        OptionalDouble avg = estream.mapToDouble(Employee::getEsal).average();
        if (avg.isPresent()) {
            System.out.println("Average Salary: "+avg.getAsDouble()); }

        System.out.println("\n×××××××××××××××××××××TOTAL SALARY××××××××××××××××××××××\n");
        estream = emplist.stream();
        double total = estream.mapToDouble(Employee::getEsal).sum();
        System.out.println("Total Salary: "+total);

        System.out.println("\n×××××××××××××××××××××DEPARTMENT EMPLOYEE'S DICTIONARY××××××××××××××××××××××\n");
        estream = emplist.stream();
        Map<String, List<Employee>> deptemps =estream.collect(Collectors.groupingBy(Employee::getEdept));
        System.out.println(deptemps);
    }
}
