package Assignment7;

import java.time.LocalDate;

// Compute Programmers Day without using plusDays. Programmers Day is the 256th day of any year
public class NoPlusDays {

    public static void main(String[] args)
    {
        LocalDate startDay = LocalDate.of(2024,1,1);
        LocalDate progDay = startDay.withDayOfYear(256);
        System.out.println("Programmer's Day is on: "+progDay);
    }
}
