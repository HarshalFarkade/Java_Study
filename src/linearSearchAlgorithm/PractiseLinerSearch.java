package linearSearchAlgorithm;

public class PractiseLinerSearch {

    public static void main(String[] args) {

        int [] nums ={18,19,22,34,56,-13};

        int target = 222;

        int ans = linerSearch(nums,target);
        System.out.println(ans);

    }

//    search in the array: return the index if item is found
//    otherwise if item not found return -1

    static int linerSearch(int [] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
//            check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
//    this line will execute  if none of the return statement above executed
//    hence the target is not found
        return -1;
    }



    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

}
