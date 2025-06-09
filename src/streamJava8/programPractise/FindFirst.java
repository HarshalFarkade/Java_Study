package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200);

//        first occurence
        number.stream().findFirst().ifPresent(System.out::println);

//        System.out.println(number.stream().findFirst());
    }
}
