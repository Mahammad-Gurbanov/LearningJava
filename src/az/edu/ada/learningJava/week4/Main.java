package az.edu.ada.learningJava.week4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Segment line1 = new Segment(12);
        Segment line2 = new Segment(19);
        Segment line3 = new Segment(10);
        Segment line4 = new Segment(9);
        Segment line5 = new Segment(19);

        Segment[] lines = {line1, line2, line3, line4, line5};
        ArrayList<Segment> longestLines1 = Segment.findMax(lines);
        for (Segment line : longestLines1){
            System.out.println(line);
        }

        line5.setLength(22.23);
        lines[4] = line5;
        ArrayList<Segment> longestLines2 = Segment.findMax(lines);
        for (Segment line : longestLines2){
            System.out.println(line);
        }
    }
}
