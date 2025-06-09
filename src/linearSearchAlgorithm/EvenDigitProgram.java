package linearSearchAlgorithm;

public class EvenDigitProgram {
    public static void main(String[] args) {
        int[] nums={12,345,2,9,7896};
        System.out.println(findEven(nums));

    }
    static int findEven(int[] nums){
        int count=0;
        for( int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;

    }
//use covert the num into string  to faster the value
    static boolean even(int num){
//        int numberDigits= digits(num);
//        return numberDigits % 2 == 0;
        return String.valueOf(num).length()%2==0;
    }


//    itera

//     static int digits(int num) {
//        int count =0;
//        while (num>0){
//            count++;
//            num=num/10;
//
//        }
//        return count;
//    }
}
