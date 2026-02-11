//    15. Java Program to Display Dates of a Calendar Year in Different Format

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dt15 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        
        System.out.println("Date (dd-MM-yyyy): " + date.format(formatter1));
        System.out.println("Date (MMM dd, yyyy): " + date.format(formatter2));
    }
}
