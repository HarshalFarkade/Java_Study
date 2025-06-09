package exception;

import java.io.UncheckedIOException;

public class Voting {
    public static void main(String[] args) {
        int age = 17;
        try{
            if (age<18){
                throw new UnderAgeException("You age must be 18 or above for Voting");
            }
        } catch (UnderAgeException e) {
            e.printStackTrace();
        }
    }
}
