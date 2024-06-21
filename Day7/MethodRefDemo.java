package Day7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MethodRefDemo
{
    public static void main(String[] args)
    {
        Integer [] arr = {12, 33, 67, 9, 5, 34, 11, 45, 89, 10, 21, 7, 1, 2, 89, 89, 9, 9, 100};
        Integer [] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        List<Integer> ilist = Arrays.asList(arr);
        System.out.println("Original List:  "+ilist);

        Stream<Integer> istream = ilist.stream();
        List<Integer> mapped = istream.distinct().sorted().map(n -> n*10).toList();     //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nMapped list*10:   "+mapped);

        istream = ilist.stream();
        List<Integer> filtered1 = istream.distinct().filter((n) -> n<50).toList();      //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nFiltered num<50:  "+filtered1);

        istream = ilist.stream();
        List<Integer> filtered2 = istream.sorted().filter((n) -> n>50).toList();        //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nFiltered num>50:  "+filtered2);

        istream = ilist.stream();
        List<Integer> firstTen = istream.limit(10).sorted().toList();           //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nFirst 10 elements sorted: "+firstTen);

        istream = ilist.stream();
        List<Integer> twoDigit = istream.distinct().filter((n) -> 10<=n && n<100).sorted().toList();    //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nTwo digit sorted numbers: "+twoDigit);

        istream = ilist.stream();
        System.out.println("\nIf number = 9 in list: "+istream.anyMatch(n -> n==9));

        istream = ilist.stream();
        System.out.println("\nIf all numbers are 9 in list: "+istream.allMatch(n -> n==9));

        istream = ilist.stream();
        //long total = istream.reduce(0, (n1,n2) -> n1+n2);
        long total = istream.reduce(0, Integer::sum);       //Integer::sum this is called method reference.
        System.out.println("\nTotal of list: "+total);

        istream = ilist.stream();
        Optional<Integer> max = istream.max(Integer::compareTo);
        System.out.println("\nMax in list: "+max.get());

        istream = ilist.stream();
        Optional<Integer> min = istream.min(Integer::compareTo);
        System.out.println("\nMin in list: "+min.get());

        istream = ilist.stream();
        OptionalDouble avg = istream.mapToDouble(Double::valueOf).average();
        System.out.println("\nAverage: "+avg.getAsDouble());
        //System.out.println("\nAverage: "+avg);      //Average: OptionalDouble[26.27777777777778]

        List<Integer> arr3 = Stream.of(Arrays.asList(arr),Arrays.asList(arr1)).flatMap(List::stream).distinct().toList();   //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nJoining 2 lists:  "+arr3);


        //dropWhile introduced from Java 9
        //Syntax: default Stream<T> dropWhile(Predicate<? super T> predicate)
        istream = ilist.stream();
        List<Integer> dropList = istream.dropWhile((n)-> n==89).toList();       //Can use  toList() instead of collect(Collectors.toList())
        System.out.println("\nDrop While number is 89:  "+dropList);
        // It checks if the number is 89, if true it drops the rest of the list.

   }
}
