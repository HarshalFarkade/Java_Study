package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;

public class TotalNumbers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200);

        System.out.println(number.stream().count());
    }
}
