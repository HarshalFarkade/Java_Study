package linearSearchAlgorithm.integersearch;

public class FindSecondMaxNum {
    public static void main(String[] args) {
        int[] arr={10,0,30,12,33,45,99};
        System.out.println(findSecondLargest(arr));

    }
    static int findSecondLargest(int[] arr){
        int firstNumber = Integer.MIN_VALUE;
        int  secondNumber=Integer.MIN_VALUE;

        for (int num:arr){
            if (num > firstNumber){
                secondNumber=firstNumber;
                firstNumber=num;
            }else if(num>secondNumber && num!= firstNumber){
                    secondNumber=num;
            }
        }
        return secondNumber==Integer.MIN_VALUE?-1:secondNumber;
    }
}
