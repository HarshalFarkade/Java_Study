package linearSearchAlgorithm.integersearch;

public class TwoNumberSumTarget {
    /* 7. Find Two Numbers that Sum to Target  */

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int target=19;
        int[] result=  findPair (arr,target);

        // Check if we found a pair
        if (result[0] != -1 && result[1] != -1) {
            // Print the actual numbers at those indices
            System.out.println("The numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found.");
        }

    };

    static int[] findPair(int [] arr,int target){
        for (int i=0; i< arr.length; i++){
            for (int j =  i+1; j < arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return new  int[]{arr[i], arr[j]};
                }
            }
        }
        return new  int[]{-1,-1};

    }
}
