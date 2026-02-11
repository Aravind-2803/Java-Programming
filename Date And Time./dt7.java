//7. How to format seconds?

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dt7 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println("Time with seconds: " + formattedTime);
    }
}
