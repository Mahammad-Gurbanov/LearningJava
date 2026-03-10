package az.edu.ada.learningJava.week6;

public class Square extends Rectangle{
    public Square(){};

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString(){
        return String.format("Square[%s]", super.toString());
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Square)) return false;

        return super.equals(obj);
    }

}
