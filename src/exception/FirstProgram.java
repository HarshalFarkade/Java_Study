package exception;

public class FirstProgram {

    public static void main(String[] args) {
        int[] numerator = {10, 20, 90, 80};
        int[] denominator ={1,0,18,9};

        for (int i =0 ; i < numerator.length;i++){
            System.out.println(
                    dividend(numerator[i],denominator[i])
            );
        }
        System.out.println("program flow is going");
    }

    public static int dividend(int a , int b){
        return a/b;
    }
}
