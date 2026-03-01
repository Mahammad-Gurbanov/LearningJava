package az.edu.ada.learningJava.week4;

import java.util.ArrayList;

public class Segment {
    private double length;

    private  void validateSegment(double length){
        if (length <= 0){
            throw new IllegalArgumentException("Length should be positive");
        }
    }

    public Segment(double length){
        validateSegment(length);
        this.length = length;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double newLength){
        validateSegment(newLength);
        this.length = newLength;
    }

    public static ArrayList<Segment> findMax(Segment[] segments){
        ArrayList<Segment> res = new ArrayList<>();
        double maxLength = 0;
        for (Segment segment : segments){
            if (segment.getLength() > maxLength) maxLength = segment.getLength();
        }

        for (Segment segment : segments){
            if (segment.getLength() == maxLength){
                res.add(segment);
            }
        }
        return res;
    }

    @Override
    public String toString(){
        return "Line segment with length of " + this.length;
    }
}
