package az.edu.ada.learningJava.week3.datetime;

public class Main {
    public static void main(String[] args) {
        // Test Constructor
        CustomDate date1 = new CustomDate(1, 3, 219);
        // CustomDate date2 = new CustomDate(1, 1, -219);
        // CustomDate date3 = new CustomDate(1, 19, 219);
        // CustomDate date4 = new CustomDate(89, 1, 219);
        // CustomDate date5 = new CustomDate(31, 6, 219);
        CustomDate date6 = new CustomDate(31, 5, 219);
        // CustomDate date7 = new CustomDate(30, 5, 219);
        // CustomDate date8 = new CustomDate(29, 2, 219);
        // CustomDate date8 = new CustomDate(29, 2, 400);
        CustomDate date9 = new CustomDate(28, 2, 400);

        // Test getters
        System.out.println(date9.getDay());
        System.out.println(date6.getYear());
        System.out.println(date1.getMonth());

        // Test setters
        // date9.setDay(30);
        date9.setDay(29);
        date6.setYear(202);
        date1.setDay(31);
        // date1.setMonth(2);
        date1.setMonth(1);
        System.out.println(date9.getDay());
        System.out.println(date6.getYear());
        System.out.println(date1.getMonth());
    }
}
