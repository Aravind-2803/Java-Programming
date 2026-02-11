//5. Program to convert time from 12 hour to 24-hour format

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dt5 {
    public static void main(String[] args) {
        String time12 = "02:30 PM";
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("hh:mm a", Locale.US);
        LocalTime localTime = LocalTime.parse(time12, formatter12);
        String time24 = localTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("Time in 24-hour format: " + time24);
    }
}
