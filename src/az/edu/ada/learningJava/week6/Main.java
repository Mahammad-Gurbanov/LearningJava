package az.edu.ada.learningJava.week6;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.isFilled());

        rectangle1.setColor("Blue");
        rectangle1.setFilled(false);
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.isFilled());

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(10, 15, "Green", true);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

        System.out.println(rectangle2);

    }
}
