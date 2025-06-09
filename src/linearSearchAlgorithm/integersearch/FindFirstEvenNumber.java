package linearSearchAlgorithm.integersearch;

public class FindFirstEvenNumber {
    public static void main(String[] args) {
        int[] arr  ={1,3,7,9,12,24};
        System.out.println("First EvenNumber:- "+FindFirstEven(arr));
        System.out.println("First OddNumber:- "+findFirstOdd(arr));

    }
    static int FindFirstEven(int[] arr){

        for (int num :arr){
            if (num%2==0){
                return num;
            }
        }
        return -1;
    }

    static int findFirstOdd(int []arr){
        for (int num :arr){
            if (num % 2 !=0){
                return num;
            }
        }
        return -1;
    }
}
