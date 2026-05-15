package az.edu.ada.learningJava.week12;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("B");
        Person p2 = new Person("A");

        Thread t1 = new Thread(() -> p1.bow(p2));
        Thread t2 = new Thread(() -> p2.bow(p1));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
