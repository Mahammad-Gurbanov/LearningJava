package az.edu.ada.learningJava.week7;

public class StackOverflowException extends RuntimeException{
    public StackOverflowException(){};
    public StackOverflowException(String message){
        super(message);
    }
}
