//2.Java Program to Display Name of a Month in (MMM) Format
//8.Java Program to Display Name of a Month in (MMM) Format

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dt2 
{
    public static void main(String[] args) 
    {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM");
        String monthName = date.format(formatter);
        System.out.println("Month (MMM): " + monthName);
    }
}
