package binarySearchAlgorithm.practise;

public class CheckIfExists {
    public static void main(String[] args) {
        int [] arr={10,9,8,7,6,5,4,3,2,1};
        int target = 11;
        System.out.println( exists(arr,target));

    };

    static boolean exists(int [] arr,int target){
        int start=0;
        int  end=arr.length-1;

        boolean isAsc =arr[start]< arr[end];

        while (start<=end){
            int mid  = start+ (end-start)/2;
            if (arr[mid]== target){
                return true;
            } else if (isAsc){
              if (arr[mid]< target){
                  end=mid-1;
              }else {
                  start=mid+1;
              }
            }else{
                    if (arr[mid]> target){
                        start=mid+1;
                    }else {
                        end=mid-1;
                    }
            }
        }
        return  false;
    }
}
