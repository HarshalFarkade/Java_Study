package linearSearchAlgorithm.integersearch;

import java.util.ArrayList;
import java.util.Arrays;

public class ListOfEvenNumberFromArray {
    /* Find all even numbers from an array and store them in a new array? */

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(findEven(arr)));
        System.out.println(Arrays.toString(UsingArrayList(arr)));

    }
// using foreach loop
    static int[] findEven(int[]arr){
        int count =0;
        for (int num: arr){
            if (num % 2  == 0){
                count++;
            }
        }
        int[] evenNumbers = new int[count];

        int index=0;
        for (int num : arr){
            if (num %  2 ==0){
                evenNumbers[index] = num;
                index++;
            }
        }
        return evenNumbers;
    }

//    using ArrayList find odd number
    static int[] UsingArrayList(int[]arr){
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        for(int num : arr){
              if (num % 2 != 0){
                  evenNumberList.add(num);
              }
        }
        return evenNumberList.stream().mapToInt(i-> i).toArray();
    }
}
