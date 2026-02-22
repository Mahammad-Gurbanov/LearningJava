package az.edu.ada.learningJava.week3.datetime;

public class Main {
    public static void main(String[] args) {
        // Test dislayDate method
        CustomDate date1 = new CustomDate(22, 3, 2025);
        CustomDate date2 = new CustomDate(22, 9, 2015);
        System.out.println(CustomDate.compare(date1, date2));
        date1.displayFormatted();
        date2.displayFormatted();
    }
}
