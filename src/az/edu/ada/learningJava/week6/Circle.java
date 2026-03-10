package az.edu.ada.learningJava.week6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal radius = new BigDecimal(this.radius);
        BigDecimal area = radius.pow(2).multiply(pi);
        area = area.setScale(2, RoundingMode.HALF_UP);
        return area.doubleValue();
    }

    public double getPerimeter(){
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal radius = new BigDecimal(this.radius);
        BigDecimal perimeter = pi.multiply(radius.add(radius));
        perimeter = perimeter.setScale(2, RoundingMode.HALF_UP);
        return perimeter.doubleValue();
    }

    @Override
    public String toString(){
        return String.format("Circle[%s, radius: %.2f]", super.toString(),
                radius);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Circle)) return false;

        Circle other = (Circle) obj;
        return other.getRadius() == radius && super.equals(other);
    }
}
