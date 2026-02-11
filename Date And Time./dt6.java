 //6. Java Program Format Time in MMMM Format

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dt6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
        String monthName = date.format(formatter);
        System.out.println("Month (MMMM): " + monthName);
    }
}
