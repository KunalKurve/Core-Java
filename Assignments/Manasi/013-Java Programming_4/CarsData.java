package Assignment5;
//1. Print all stock for the specific model and car.
//2. Group the data by model
//3. Count no of cars per model
//4. Sort by price
//5. Sort by manufacturing year

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CarsData
{
    public static List<Cars> getCars()
    {
        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Cars("Maruti","Baleno",1000, 2015,600000.0));
        carsList.add(new Cars("Ford","EcoSport",500, 2015,1000000.0));
        carsList.add(new Cars("Kia","Seltos",6000, 2020,1500000.0));
        carsList.add(new Cars("Hyundai","Hyrider",10000, 2024,2200000.0));
        carsList.add(new Cars("Maruti","Alto",30000, 2009,800000.0));
        carsList.add(new Cars("Ford","Mustang",700, 2020,1300000.0));
        carsList.add(new Cars("Kia","Carens",900, 2020,2000000.0));
        carsList.add(new Cars("Hyundai","VelFire",100, 2024,9000000.0));

        return carsList;
    }

    public static void main(String[] args)
    {
        List<Cars> carsList = getCars();
        Stream<Cars> cstream = carsList.stream();

        cstream.forEach(System.out::println);
        System.out.println("\n××××××××××××××××××××××Print all stock for the specific model and car.×××××××××××××××××××××××\n");

//        cstream = carsList.stream();
//        Map<String, Map<Integer,Long>> mMap = cstream.collect(Collectors.groupingBy(Cars::getName,(Cars::getModelCount , Collectors.counting()));
//        System.out.println(mMap);

        cstream = carsList.stream();
        Long mCount = cstream.filter(n -> n.getName() == "Maruti").count();
        System.out.println("Total Models of Maruti: "+mCount);
        cstream = carsList.stream();
        Long mTotal = cstream.filter(n -> n.getName() == "Maruti").mapToLong(Cars::getModelCount).sum();
        System.out.println("Total Stock of Maruti: "+mTotal);

        cstream = carsList.stream();
        Long fCount = cstream.filter(n -> n.getName() == "Ford").count();
        System.out.println("Total Models of Ford: "+fCount);
        cstream = carsList.stream();
        Long fTotal = cstream.filter(n -> n.getName() == "Ford").mapToLong(Cars::getModelCount).sum();
        System.out.println("Total Stock of Ford: "+fTotal);

        cstream = carsList.stream();
        Long kCount = cstream.filter(n -> n.getName() == "Kia").count();
        System.out.println("Total Models of Kia: "+kCount);
        cstream = carsList.stream();
        Long kTotal = cstream.filter(n -> n.getName() == "Kia").mapToLong(Cars::getModelCount).sum();
        System.out.println("Total Stock of Kia: "+kTotal);

        cstream = carsList.stream();
        Long hCount = cstream.filter(n -> n.getName() == "Hyundai").count();
        System.out.println("Total Models of Hyundai: "+hCount);
        cstream = carsList.stream();
        Long hTotal = cstream.filter(n -> n.getName() == "Hyundai").mapToLong(Cars::getModelCount).sum();
        System.out.println("Total Stock of Hyundai: "+hTotal);


        System.out.println("\n××××××××××××××××××××××Group the data by model×××××××××××××××××××××××\n");
        cstream = carsList.stream();
        List<Cars> marutiList = cstream.filter(n -> n.getName()=="Maruti").collect(Collectors.toList());
        System.out.println("Maruti:");
        marutiList.forEach(System.out::println);

        cstream = carsList.stream();
        List<Cars> FordList = cstream.filter(n -> n.getName()=="Ford").collect(Collectors.toList());
        System.out.println("\nFord:");
        FordList.forEach(System.out::println);

        cstream = carsList.stream();
        List<Cars> kiaList = cstream.filter(n -> n.getName()=="Kia").collect(Collectors.toList());
        System.out.println("\nKia:");
        kiaList.forEach(System.out::println);

        cstream = carsList.stream();
        List<Cars> hyundaiList = cstream.filter(n -> n.getName()=="Hyundai").collect(Collectors.toList());
        System.out.println("\nHyundai:");
        hyundaiList.forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××Count no of cars per model×××××××××××××××××××××××\n");
        cstream = carsList.stream();
        Map<String, Long> modelMap = cstream.collect(Collectors.groupingBy(Cars::getName , Collectors.counting()));
        System.out.println(modelMap);

        System.out.println("\n××××××××××××××××××××××Sort by price×××××××××××××××××××××××\n");
        cstream = carsList.stream();
        Comparator<Cars> byPrice = Comparator.comparing(Cars::getPrice);
        cstream.sorted(byPrice).forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××Sort by year×××××××××××××××××××××××\n");
        cstream = carsList.stream();
        Comparator<Cars> byYear = Comparator.comparing(Cars::getYear);
        cstream.sorted(byYear).forEach(System.out::println);

    }
}
