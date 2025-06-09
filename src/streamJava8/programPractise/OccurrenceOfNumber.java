package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        {/* write program to find occurrence of number in array*/}
        List<Integer> ls  = Arrays.asList(10,10,20,3,4,5,20,44,33,44);

        System.out.println(ls.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));
    }
}
