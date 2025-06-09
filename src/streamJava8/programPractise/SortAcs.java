package streamJava8.programPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAcs {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200,12,34,55);
//        asc sorting
       List<Integer> asc= number.stream().sorted().toList();
        System.out.println("Ascending order: "+asc);
//        desc sorting
        List<Integer> descending = number.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("descending order: "+descending);
    }
}
