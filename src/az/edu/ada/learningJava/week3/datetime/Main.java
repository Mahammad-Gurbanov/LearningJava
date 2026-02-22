package az.edu.ada.learningJava.week3.datetime;

import az.edu.ada.learningJava.week3.Math.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3, -4);
        ComplexNumber num2 = new ComplexNumber(-8, 6);
        System.out.println(num1.sub(num2));

    }
}
