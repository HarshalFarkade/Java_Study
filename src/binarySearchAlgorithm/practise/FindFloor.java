package binarySearchAlgorithm.practise;

public class FindFloor {
//    In the context of binary search on a sorted array, the ceiling of a number is defined as:
//The smallest element in the array that is greater than or equal to the target number.
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findFloor(arr,15));

    }

    static int findFloor(int[]arr, int target){
        int st=0;
        int ed=arr.length-1;

        int result =-1;
        boolean isAsc=arr[st] < arr[ed];

        while(st  <= ed){
            int mid =st+(ed-st)/2;

            if (arr[mid] == target){
                return arr[mid];

            }else if(isAsc){
               if (arr[mid]<target){
                   result=arr[mid];
                   st=mid+1;
               }else {

                   ed=mid-1;
               }
            }else {
               if (arr[mid]> target){
                   result=arr[mid];
                   st=mid+1;
               }else {

                   ed=mid-1;
               }
            }
        }
        return result;
    }
}
