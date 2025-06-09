package binarySearchAlgorithm.practise;

public class PositionOfElement {
    public static void main(String[] args) {
        int [] dss={1,2,3,5,7,10};

        int target=7;
        System.out.println("position of Element:"+searchInsert(dss,target));

    }
    static int  searchInsert(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int pos=arr.length;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]>=target){
                pos=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return pos;
    }
}
