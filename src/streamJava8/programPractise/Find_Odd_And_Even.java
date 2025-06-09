package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;

public class Find_Odd_And_Even {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,20,12,34,55,200);

//        even number
        List<Integer> even  = number.stream().filter(num-> num%2 ==0).toList();
        System.out.println("Even Number :-> "+even);

//        odd number
        List<Integer> odd  = number.stream().filter(num-> num%2 !=0).toList();
        System.out.println("odd Number :-> "+odd);


    }
}
