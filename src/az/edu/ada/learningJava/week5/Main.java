package az.edu.ada.learningJava.week5;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 13);
        Rectangle r2 = new Rectangle(12, 13);
        Rectangle r3 = new Rectangle(29, 30);
        System.out.println(r1.equals(r1));
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals("12 13"));

    }
}
