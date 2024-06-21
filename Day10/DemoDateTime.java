package Day10;

import java.time.*;
import java.util.Set;

public class DemoDateTime
{
    public static void main(String[] args) {
        LocalTime later = LocalTime.of(12,30);

        LocalDateTime dt = later.atDate(LocalDate.now());
        System.out.println(dt);

        dt = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println(dt);
        dt = LocalDateTime.of(2024,10,10,11,25,30);
        System.out.println(dt);

        Set<String> zones = ZoneId.getAvailableZoneIds();
        for(String zone: zones)
            System.out.println(zone);

        ZonedDateTime zdt1 = dt.atZone(ZoneId.of("Australia/Victoria"));
        System.out.println(zdt1);

        ZonedDateTime zdt2 = dt.atZone(ZoneId.of("America/Toronto"));
        System.out.println(zdt2);

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("America/Toronto"));
        System.out.println(zdt);        //Inaccurate

        LocalDateTime local = zdt.toLocalDateTime();
        System.out.println(local);

        ZonedDateTime zdt3 = dt.atZone(ZoneId.of("Asia/Kolkata"));
        System.out.println(zdt3);

        Duration durationB = Duration.between(zdt1, zdt3);
        System.out.println(durationB);

    }
}
