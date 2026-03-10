package az.edu.ada.learningJava.week6;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(10, "Blue", true);
        Circle c4 = new Circle(10, "Red", false);
        Circle c5 = new Circle(10, "Red", true);

        System.out.println("Circle equals");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));
        System.out.println(c1.equals(c5));
        System.out.println(c1.equals("dhwio"));
        System.out.println(c1.equals(10));

        System.out.println("Rectangle equals");
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);
        Rectangle r3 = new Rectangle(10, 20, "White", true);
        Rectangle r4 = new Rectangle(10, 20, "Red", false);
        Rectangle r5 = new Rectangle(10, 20, "Red", true);
        Rectangle r6 = new Rectangle(10, 22);
        Rectangle r7 = new Rectangle(12, 20);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals(r4));
        System.out.println(r1.equals(r5));
        System.out.println(r1.equals(r6));
        System.out.println(r1.equals(r7));


        System.out.println("Square equals");
        Square sq1 = new Square(10);
        Square sq2 = new Square(10);
        Square sq3 = new Square(12);
        Square sq4 = new Square(10, "Blue", true);
        Square sq5 = new Square(10, "Red", false);

        System.out.println(sq1.equals(sq2));
        System.out.println(sq1.equals(sq3));
        System.out.println(sq1.equals(sq4));
        System.out.println(sq1.equals(sq5));

    }
}
