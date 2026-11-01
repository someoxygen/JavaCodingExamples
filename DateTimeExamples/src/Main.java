import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(localDateTime.format(formatter));

        LocalDate localDate2 = LocalDate.of(2026,10,15);
        System.out.println(localDate2);

        LocalTime localTime2 = LocalTime.of(15,30,25);
        System.out.println(localTime2);

        LocalDateTime localDateTime2 = LocalDateTime.of(2026,10,15,16,25,30);
        System.out.println(localDateTime2.format(formatter));

        LocalDateTime localDateTime3 = LocalDateTime.of(2026,11,12,18,20,15);
        System.out.println(localDateTime3.format(formatter));

        if(localDateTime2.isBefore(localDateTime3)){
            System.out.println(localDateTime2.format(formatter) + " is before than " + localDateTime3.format(formatter));
        }
        else if(localDateTime2.isAfter(localDateTime3)){
            System.out.println(localDateTime2.format(formatter) + " is after than " + localDateTime3.format(formatter));
        }
        else {
            System.out.println(localDateTime2.format(formatter) + " is equal to " + localDateTime3.format(formatter));
        }
    }
}
