package streamJava8.programPractise;

import java.util.*;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200,12,34,55);
        Set<Integer> num = new HashSet<>();
       List<Integer> duplicate = number.stream().filter(n-> !num.add(n)).toList();
        System.out.println(duplicate);

    }
}
