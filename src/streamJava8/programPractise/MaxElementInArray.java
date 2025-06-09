package streamJava8.programPractise;

import java.util.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {
        {/* write a program to find max element in array*/}
        int[] numb={2,3,5,10,1000};
        Arrays.stream(numb).max().ifPresent(System.out::println);
    }
}
