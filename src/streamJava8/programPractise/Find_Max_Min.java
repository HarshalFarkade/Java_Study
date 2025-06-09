package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_Max_Min {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200,12,34,55);

        System.out.println("Maximum :"+number.stream().max(Integer::compareTo).get());
        System.out.println("minimum :"+number.stream().min(Integer::compareTo).get());
    }
}
