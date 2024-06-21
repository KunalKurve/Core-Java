package Assignment7;

import java.time.LocalDate;
import java.time.Period;

// calculate your age in number of days, months, years
public class AgeDate
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate dob= LocalDate.of(2000,4,4);

        Period period = Period.between(dob, today);
        System.out.printf("Age is %d years, %d months and %d days old", period.getYears(), period.getMonths(), period.getDays());
    }
}
