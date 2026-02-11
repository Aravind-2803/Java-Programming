//12. How to display time in different languages?


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class dt12 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatterEN = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);
        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("HH:mm", Locale.FRENCH);
        
        System.out.println("Time (English): " + time.format(formatterEN));
        System.out.println("Time (French): " + time.format(formatterFR));
    }
}
