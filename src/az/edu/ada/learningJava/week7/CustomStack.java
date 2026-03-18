package az.edu.ada.learningJava.week7;

public class CustomStack {
    private int size = 10;
    private int[] stack;
    private int elementCount = 0;
    private static final int MAXSIZE = 100;
    private int initialSize = 10;

    private boolean shouldExpand(){
        return elementCount * 2 >= size;
    }

    private boolean shouldShrink(){
        return elementCount * 4 < size && size > initialSize;
    }

    private void expandStack(){
        if (size == MAXSIZE) return;

        int[] oldStack = stack;
        size *= 2;
        if (size > MAXSIZE) size = MAXSIZE;
        stack = new int[size];
        for (int i = 0; i < elementCount; i++){
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
        if (size > MAXSIZE)
            throw new InvalidSizeException("Stack can't exceed " + MAXSIZE +
                " elements");
        this.size = size;
        initialSize = size;
    }

    public int getSize() {
        return size;
    }

    public int getElementCount() {
        return elementCount;
    }

    public void push(int element){
        if (elementCount >= MAXSIZE)
            throw new StackOverflowException("Stack can't exceed " + MAXSIZE +
                " elements.");

        if (shouldExpand()) expandStack();

        stack[elementCount] = element;
        elementCount++;
    }
}
