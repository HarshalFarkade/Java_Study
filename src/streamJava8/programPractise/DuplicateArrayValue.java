package streamJava8.programPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArrayValue {
    public static void main(String[] args) {
//        check array contain duplicate value or not?
        int[] numbes  ={1,2,3};


       if(Arrays.stream(numbes).distinct().count()!=numbes.length) {
           System.out.println("array contain duplicate number");
        }else {
           System.out.println("no duplicate value is present");
       }
    }

}
