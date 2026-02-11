//11. Java Program to Display Time in Different Country Format

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dt11 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("hh:mm a", Locale.US);
        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("HH:mm", Locale.FRANCE);
        
        System.out.println("Time (US): " + time.format(formatterUS));
        System.out.println("Time (France): " + time.format(formatterFR));
    }
}
