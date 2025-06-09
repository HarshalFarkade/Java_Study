package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCaharc {
    public static void main(String[] args) {
        {/* write a program to count each character in string using stream*/}
        String name =  "Harshal";
        Map<Character, Long> ls = name.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ls);

    }
}
