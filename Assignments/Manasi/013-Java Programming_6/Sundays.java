package Assignment7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Find out all months that started with Sundays for year 2023
public class Sundays
{
    public static void main(String[] args)
    {
        Stream<LocalDate> year2023 = LocalDate.of(2023,1,1).datesUntil(LocalDate.of(2024,1,1));
        Predicate<LocalDate> sundays = (days) -> days.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        Predicate<LocalDate> startDate = (days) -> days.getDayOfMonth() == 1;

        year2023.filter(sundays).filter(startDate).forEach(System.out::println);
    }
}