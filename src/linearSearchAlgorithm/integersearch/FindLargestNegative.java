package linearSearchAlgorithm.integersearch;

public class FindLargestNegative {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,-1,-2,-10};

        System.out.println("Largest Negative Number: "+largestNegative(arr));
        System.out.println("smallest Negative Number: "+smallestNegative(arr));

    }

    //   logic for largest negative
    static int largestNegative(int [] arr){
        int maxNeg =Integer.MIN_VALUE;
        for (int num:arr){
            if (num<0 && num>maxNeg){
                maxNeg=num;
            };
        }
        return maxNeg==Integer.MIN_VALUE?-1:maxNeg;
    }

//   logic for small negative
    static int smallestNegative(int [] arr){
        int maxNeg =Integer.MAX_VALUE;
        for (int num:arr){
            if (num<0 && num<maxNeg){
                maxNeg=num;
            };
        }
        return maxNeg==Integer.MIN_VALUE?-1:maxNeg;
    }
}
