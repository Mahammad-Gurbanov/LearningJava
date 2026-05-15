package az.edu.ada.learningJava.week12;

public class Main {
    public static void main(String[] args) {
        PolitePerson p1 = new PolitePerson("B");
        PolitePerson p2 = new PolitePerson("A");

        Thread t1 = new Thread(() -> p1.giveWay(p2));
        Thread t2 = new Thread(() -> p2.giveWay(p1));

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
