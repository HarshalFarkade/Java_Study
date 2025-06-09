package binarySearchAlgorithm.practise;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,567,8};
        System.out.println(firstOcc(arr,4));
//        System.out.println(firstOcc(arr,567));

    }

    static int firstOcc(int[] arr,int target){
        int st= 0;
        int ans=-1;
        int end=arr.length-1;

        boolean isAsc= arr[st]< arr[end];
        while (st<=end){
            int mid =st+(end-st)/2;
            if(arr[mid] == target){
                ans=mid;
                // move towards left to find first occurrence
                end=mid-1;
            }

            if (isAsc){
                if (arr[mid] <target){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }else {
                if (arr[mid] > target){
                    end=mid-1;
                }else {
                    st=mid+1;
                }
            }
        }
        return ans;
    }
}
