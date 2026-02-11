//10. How to add time to Date?

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class dt10 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        LocalDateTime newDate = date.plus(2, ChronoUnit.HOURS);
        System.out.println("Original Date and Time: " + date);
        System.out.println("New Date and Time: " + newDate);
    }
}
