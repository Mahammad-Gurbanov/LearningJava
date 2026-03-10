package az.edu.ada.learningJava.week6;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.isFilled());

        c1.setColor("Blue");
        c1.setFilled(false);
        System.out.println(c1.getRadius());
        System.out.println(c1.isFilled());

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        Circle c2 = new Circle(10, "Green", true);
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

    }
}
