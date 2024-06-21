package Assignment7;

import java.time.*;

//If we leave Mumbai at 2:05 am and arrive in New York at 4:40 pm. How long is the flight?
public class MumbaiToNewYork
{
    public static void main(String[] args)
    {
        LocalDateTime dateMumbai = LocalDateTime.of(2024, 4,5,2,5, 0);
        LocalDateTime dateNY = LocalDateTime.of(2024, 4,5,16,40, 0);
        ZonedDateTime zdtM = dateMumbai.atZone(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime zdtNY = dateNY.atZone(ZoneId.of("America/Toronto"));
        System.out.println(zdtM);
        System.out.println(zdtNY);
        Duration time = Duration.between(zdtM,zdtNY);
        System.out.println("Time Duration: "+time);
    }
}