package Day10;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DemoTime {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime noon = LocalTime.NOON;

        LocalTime later = LocalTime.of(12,30);
        if(now.isBefore(noon))
            System.out.println("Good Morning");
        else
            System.out.println("Good Afternoon");


        System.out.println(later.getHour());
        System.out.println(later.getMinute());
        System.out.println(later.getSecond());

        long time = now.until(later, ChronoUnit.SECONDS);
        System.out.println(time);

        later = later.plus(2, ChronoUnit.HOURS);
        System.out.println(later);
    }
}
