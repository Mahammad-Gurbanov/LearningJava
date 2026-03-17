package az.edu.ada.learningJava.week7;

public class InvalidSizeException extends RuntimeException{
    public InvalidSizeException(){}
    public InvalidSizeException(String message){
        super(message);
    }
}
