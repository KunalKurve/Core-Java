package Day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList
{
    public static void main (String [] args)
    {
//        List lst = new ArrayList<>();
//        lst.add(100);
//        lst.add("AAA");
//        lst.add(true);
//        lst.add(11.1);
//
//        Integer i = (Integer) lst.get(1);
//        System.out.println(i);
//        Here we get an error at runtime as we are trying to retrieve an integer for a char. hence we specify the type of list to avoid these errors.

        List<Integer> lst = new ArrayList<>();
        lst.add(100);
        lst.add(123);
        lst.add(456);
        lst.add(675);
        lst.add(609);
        // Here if we pass anything other than integer we will get an error at the compile time itself.
        Integer j = lst.get(1);
        System.out.println(j);

        lst.remove(2);
        System.out.println(lst);

        for (int i=0; i<lst.size(); i++)
        {
            System.out.println(lst.get(i));
        }

        for (Integer n:lst)
        {
            System.out.println(n);
        }

        //Iterator<Integer> it = new lst.Iterator();
        //while (it.hasNext())
    }
}