package az.edu.ada.learningJava.week5;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height){
        if (width <= 0 || height <= 0){
            throw new IllegalArgumentException("Dimensions must be positive");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle otherRect = (Rectangle) obj;
        return this.width == otherRect.width && this.height == otherRect.height;
    }
}
