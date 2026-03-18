package az.edu.ada.learningJava.week7;

public class TestCustomStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        System.out.println(stack.getElementCount());
        System.out.println(stack.getSize());

        stack.push(10);
        System.out.println(stack.getElementCount());
        System.out.println(stack.getSize());

        for (int i = 0; i < 10; i++){
            stack.push(i + 1);
        }

        System.out.println(stack.getElementCount());
        System.out.println(stack.getSize());

        for (int i = 30; i < 119; i++){
            stack.push(i);
        }

        System.out.println(stack.getElementCount());
        System.out.println(stack.getSize());

        stack.push(9);


    }

}
