package linearSearchAlgorithm.integersearch;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,6,7};
//        passing max number form  array
        int missing=7;
        System.out.println(missingNums(arr,missing));

    }

    static int missingNums(int [] arr,int num){
        int excepetedSum=num*(num+1)/2;
        int actualSum=0;
        for (int i: arr){
            actualSum+=i;
//            return excepetedSum-actualSum;
        }
        return excepetedSum-actualSum;

    }
}
