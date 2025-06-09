package exception;

public class UnderAgeException extends RuntimeException{
     private String message;
    UnderAgeException(){
        super("You are Under Age");
    }
    UnderAgeException(String message){
        super(message);
    }
}
