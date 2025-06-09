package streamJava8.programPractise;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumRamdom {
    public static void main(String[] args) {
        {/* write a program to print 10 random number in stream*/}

        Random num = new Random();
        List<Integer>numbs=Stream.generate(num::nextInt).limit(10).collect(Collectors.toList());
        System.out.println(numbs);
    }
}
