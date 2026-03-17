package az.edu.ada.learningJava.week7;

public class CustomStack {
    private int size = 20;
    private int[] stack;

    public CustomStack(){
        stack = new int[size];
    }

    public CustomStack(int size){
        if (size <= 0) throw new
                InvalidSizeException("Size must be a positive Integer");
        this.size = size;
    }
}
