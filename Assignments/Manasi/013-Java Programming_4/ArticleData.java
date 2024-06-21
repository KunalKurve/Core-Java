package Assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//
//1. Perform following operations for a website that maintains articles
//
//    1. List all the articles that were created in year 2023
//    2. List all the documents for subject "AI"
//    3. Sort the articles by Subject
//    4. Count the articles by Subject
//    5. Count the articles that got more than 1k views
//    6. Group and count ARTICLES BY THE PUBLISHED YEARS
public class ArticleData
{
    public static List<Articles> getArticles()
    {
        List<Articles> articlesList = new ArrayList<>();
        articlesList.add(new Articles("A1",1990,"AI",1000));
        articlesList.add(new Articles("A56",2000,"ML",2000));
        articlesList.add(new Articles("A11",2023,"DL",10000));
        articlesList.add(new Articles("A32",1995,"AI",3000));
        articlesList.add(new Articles("A77",2023,"ITISS",2000));
        articlesList.add(new Articles("A10",2022,"BDA",8000));
        articlesList.add(new Articles("A53",2023,"DAC",500));
        articlesList.add(new Articles("A90",2024,"AI",10000));

        return articlesList;
    }
    public static void main(String[] args) {
        List<Articles> artList = getArticles();
        Stream<Articles> astream = artList.stream();

        astream.forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××List all the articles that were created in year 2023×××××××××××××××××××××××");
        astream = artList.stream();
        List<Articles> y2023 = astream.filter(n -> n.getYear()==2023).collect(Collectors.toList());
        y2023.forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××List all the documents for subject AI×××××××××××××××××××××××");
        astream = artList.stream();
        List<Articles> subList = astream.filter(n -> n.getSub()=="AI").collect(Collectors.toList());
        subList.forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××Sort the articles by Subject×××××××××××××××××××××××");
        astream = artList.stream();
        Comparator<Articles> bySub = Comparator.comparing(Articles::getSub);
        astream.sorted(bySub).forEach(System.out::println);

        System.out.println("\n××××××××××××××××××××××Count the articles by Subject×××××××××××××××××××××××");
        astream = artList.stream();
        Map<String, Long> subMap = astream.collect(Collectors.groupingBy(Articles::getSub , Collectors.counting()));
        System.out.println(subMap);

        System.out.println("\n××××××××××××××××××××××Count the articles that got more than 1k views×××××××××××××××××××××××");
        astream = artList.stream();
        Map<Integer, Long> viewMap = astream.filter(n -> n.getViews()>1000).collect(Collectors.groupingBy(Articles::getViews , Collectors.counting()));
        System.out.println(viewMap);

        astream = artList.stream();
        Predicate<Articles> viewRange = n -> n.getViews()>1000;
        astream.filter(viewRange).forEach(System.out::println);

        astream = artList.stream();
        Long viewCount = astream.filter(n -> n.getViews()>1000).collect(Collectors.counting());
        System.out.println("Total Count of view more than 1k= "+viewCount);

        System.out.println("\n××××××××××××××××××××××Group and count articles by the published years×××××××××××××××××××××××");
        astream = artList.stream();
        Map<Integer, Long> yearMap = astream.collect(Collectors.groupingBy(Articles::getYear , Collectors.counting()));
        System.out.println(yearMap);
    }
}
