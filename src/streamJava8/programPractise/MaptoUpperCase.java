package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaptoUpperCase {
    public static void main(String[] args) {
        {/* how to use map to convert the words into uppercase*/}
        List<String> ls = Arrays.asList("harsh","vrushabh","saurabh","pawan");
        List<String> upperls = ls.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperls);
    }
}
