//  14. How to find which week of the year?
import java.time.LocalDate;

public class dt14 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int week = date.get(java.time.temporal.IsoFields.WEEK_OF_WEEK_BASED_YEAR);
        System.out.println("Week of the year: " + week);
    }
}
