package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Join2Streams {
    public static void main(String[] args) {
        {/* write a program to join 2 stream*/}
        Stream<String> s1 = Stream.of("Jai","Shree");
        Stream<String> s2 =Stream.of("Ram");
        List<String> connect=  Stream.concat(s1,s2).collect(Collectors.toList());
        System.out.println(connect);



    }
}
