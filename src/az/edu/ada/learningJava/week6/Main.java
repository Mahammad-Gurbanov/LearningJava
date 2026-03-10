package az.edu.ada.learningJava.week6;

public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.getSide());
        System.out.println(sq.getSide());
        System.out.println(sq);

        Square square = new Square(10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        square.setSide(20);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square);

    }
}
