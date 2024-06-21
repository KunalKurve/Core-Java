package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DemoStream {
    public static void main(String[] args)
    {
        int [] arr = {23, 7, 30, 12, 82, 12, 85, 21, 85, 65, 75, 86 };
        IntStream istream = Arrays.stream(arr);

        long distinctEle = istream.distinct().count();
        System.out.println(distinctEle);

        istream = Arrays.stream(arr);
        long allele = istream.count();
        System.out.println(allele);

        istream = Arrays.stream(arr);
        istream.distinct().sorted().forEach((n)->System.out.println(n));

        istream = Arrays.stream(arr);
        List<Integer> squares = istream.distinct().sorted().map((n) -> n*n).boxed().collect(Collectors.toList());
        System.out.println(squares);

        istream = Arrays.stream(arr);
        List<Integer> even = istream.distinct().filter((n) -> n%2==0).boxed().collect(Collectors.toList());
        System.out.println(even);

        istream = Arrays.stream(arr);
        int total = istream.reduce(1, (n1,n2)-> n1+n2);
        System.out.println("Total" + total);

        istream = Arrays.stream(arr);
        OptionalInt min = istream.min();
        if (min.isPresent())
            System.out.println(min.getAsInt());


        istream = Arrays.stream(arr);
        OptionalInt max = istream.max();
        if (max.isPresent())
            System.out.println(max.getAsInt());

        istream = Arrays.stream(arr);
        OptionalDouble avg = istream.average();
        if (avg.isPresent())
            System.out.println(avg.getAsDouble());
    }


}
