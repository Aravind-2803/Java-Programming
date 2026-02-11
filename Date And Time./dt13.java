//13. Java Program to Show Time by Rolling Through Hours and Months
  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dt13 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM HH:mm");

        // Rolling through hours
        System.out.println("Rolling through hours:");
        for (int i = 0; i < 5; i++) {
            LocalDateTime nextHour = now.plusHours(i);
            System.out.println(nextHour.format(formatter));
        }

        // Rolling through months
        System.out.println("\nRolling through months:");
        for (int i = 0; i < 5; i++) {
            LocalDateTime nextMonth = now.plusMonths(i);
            System.out.println(nextMonth.format(formatter));
        }
    }
}
