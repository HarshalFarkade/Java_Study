package streamJava8.programPractise;

import java.util.Arrays;

public class SortArrayToStream {
    public static void main(String[] args) {
        {/* write a program to sort array and then convert it into stream*/}
        int[] numbs={1,3,2,4,7,8,5,9,6,10};
        Arrays.sort(numbs);
        Arrays.stream(numbs).forEach(System.out::println);
    }
}
