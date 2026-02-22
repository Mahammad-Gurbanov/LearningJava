package az.edu.ada.learningJava.week3.datetime;

public class Main {
    public static void main(String[] args) {
        // Test dislayDate method
        CustomDate date1 = new CustomDate(22, 3, 2025);
        CustomDate date2 = new CustomDate(10, 2, 2026);
        System.out.println(date1.difference(date2));
    }
}
