package streamJava8.programPractise;

import java.time.LocalDateTime;

public class PrintDateAndTime {
    public static void main(String[] args) {
        {/* print date and time using java8*/}
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
