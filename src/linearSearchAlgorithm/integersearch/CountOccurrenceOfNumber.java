package linearSearchAlgorithm.integersearch;

public class CountOccurrenceOfNumber {
    public static void main(String[] args) {
        //         0,1,2,3,4,5,6,7,8,9,10,11---> index
        int[] arr={1,2,3,4,5,6,7,8,9,1,2,1};
        int target=1;
        System.out.println(countOcc(arr,target));

    }

    static int countOcc(int[] arr,int num){
        int count=0;
        for(int i:arr){
            if (i==num){
                count++;
            }
        }
        return count;
    }
}
