package linearSearchAlgorithm.integersearch;

public class SmallestPositiveNumber {
    public static void main(String[] args) {
//                 0,1,2,3,4,5,6,7,8,9,10,11--> index
        int[] arr={1,2,3,4,5,6,7,8,9,1,2,1};
        System.out.println(smallestpositiveNumber(arr));

    }

    static int smallestpositiveNumber(int []arr){
        int min =Integer.MAX_VALUE;
        for (int num : arr){
            if (num>0 && num<min){
                min=num;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
