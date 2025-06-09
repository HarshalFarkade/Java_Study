package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;

public class FindSqaure {
    public static void main(String[] args) {
        {/* java8 Program to perform square on list elements and filter  number greater than 50 */}

        List<Integer> numbers= Arrays.asList(10,20,30,32,43,50,2,5) ;
      List<Integer> numbs=  numbers.stream().map(num-> num*num).filter(num->num>50).toList();
        System.out.println(numbs);

    }
}
