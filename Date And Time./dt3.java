//3. Java Program to Display Current Hour and Current Minute

import java.time.LocalTime;

public class dt3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Hour: " + time.getHour());
        System.out.println("Current Minute: " + time.getMinute());
    }
}
