package az.edu.ada.learningJava.week7;

import java.util.ArrayList;

public class CustomStack <T> {
    private int size = 10;
    private ArrayList<T> stack;
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
        size *= 2;
    }

    private void shrinkStack(){
        size /= 2;
    }

    public CustomStack(){
        stack = new ArrayList<>();
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

    public void push(T element){
        if (elementCount >= MAXSIZE)
            throw new StackOverflowException("Stack can't exceed " + MAXSIZE +
                " elements.");

        if (shouldExpand()) expandStack();

        stack.add(elementCount, element);
        elementCount++;
    }

    public T pop(){
        if (elementCount == 0)
            throw new InvalidSizeException("Can't pop from an empty stack");

        if (shouldShrink()) shrinkStack();

        elementCount--;
        return stack.get(elementCount);
    }

    public T peek(){
        if (elementCount == 0)
            throw new InvalidSizeException("Can't peek an element in an empty" +
                    " stack");
        return stack.get(elementCount - 1);
    }
}
