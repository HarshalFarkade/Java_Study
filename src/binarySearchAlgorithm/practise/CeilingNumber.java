package binarySearchAlgorithm.practise;

public class CeilingNumber {
//    smallest number in the array which is greater or equal to target
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(findCeilin(arr,15));

    }

    static int findCeilin(int[] arr,int target){
        int st= 0;
        int ed = arr.length-1;
        int result= -1;


        boolean isAsc =arr[st]< arr[ed];

        while(st <= ed){
            int mid =st+(ed-st)/2;

            if (arr[mid] == target) {
                return arr[mid];
            }else if(isAsc){
                if (arr[mid]<target){
                    st=mid+1;
                }else {
                    result=arr[mid];
                    ed=mid-1;
                }
            }else {
                if (arr[mid]>target){
                    st=mid+1;
                }else {
                    result=arr[mid];
                    ed=mid-1;
                }
            }

        }
        return result;
    }

}
