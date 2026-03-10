package az.edu.ada.learningJava.week6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getArea(){
        BigDecimal width = new BigDecimal(this.width);
        BigDecimal length = new BigDecimal(this.length);
        BigDecimal area = width.multiply(length);
        area = area.setScale(2, RoundingMode.HALF_UP);
        return area.doubleValue();

    }

    public double getPerimeter(){
        BigDecimal width = new BigDecimal(this.width);
        BigDecimal length = new BigDecimal(this.length);
        BigDecimal perimeter = width.add(length);
        perimeter = perimeter.add(perimeter);
        perimeter = perimeter.setScale(2, RoundingMode.HALF_UP);
        return perimeter.doubleValue();
    }

    @Override
    public String toString(){
         return String.format("Rectangle[%s, width: %.2f, length: %.2f]",
                super.toString(), width, length);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Rectangle)) return false;

        Rectangle other = (Rectangle) obj;
        return other.getLength() == length && other.getWidth() == width &&
                super.equals(other);
    }
}
