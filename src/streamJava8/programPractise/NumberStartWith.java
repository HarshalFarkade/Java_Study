package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;

public class NumberStartWith {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,15,20, 55,54,45,100);

//        find the number start with 5
        List<Integer> number=  nums.stream().filter(num-> num.toString().startsWith("5")).toList();
        System.out.println("number with Start with5: "+ number);
    }
}
