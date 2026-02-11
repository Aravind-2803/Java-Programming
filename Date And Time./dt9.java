//9. Java Program to Display Name of the Weekdays in Calendar Year

import java.time.DayOfWeek;
import java.time.LocalDate;

public class dt9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day of the week: " + day);
    }
}
