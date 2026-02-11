//1. Java Program to Format Time in AM-PM format

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (HH:mm): ");
        String input = scanner.next();
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.parse(input, inputFormatter);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedTime = time.format(outputFormatter);
        
        System.out.println("Time in AM-PM: " + formattedTime);
    }
}
