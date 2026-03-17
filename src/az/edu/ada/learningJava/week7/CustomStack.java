package az.edu.ada.learningJava.week7;

public class CustomStack {
    private int size = 5;
    private int[] stack;
    private int elementCount = 0;

    private boolean shouldExpand(){
        return elementCount * 2 >= size;
    }

    private boolean shouldShrink(){
        return elementCount * 4 < size && elementCount > 20;
    }

    private void expandStack(){
        int[] oldStack = stack;
        size *= 2;
        stack = new int[size];
        for (int i = 0; i < oldStack.length; i++){
            stack[i] = oldStack[i];
        }

    }

    private void shrinkStack(){
        int[] oldStack = stack;
        size /= 2;
        stack = new int[size];
        for (int i = 0; i < elementCount; i++){
            stack[i] = oldStack[i];
        }

    }

    public CustomStack(){
        stack = new int[size];
    }

    public CustomStack(int size){
        if (size <= 0) throw new
                InvalidSizeException("Size must be a positive Integer");
        this.size = size;
    }
}
