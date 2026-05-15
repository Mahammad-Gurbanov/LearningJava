package az.edu.ada.learningJava.week12;

public class Main {
    public static void main(String[] args) {
        SharedResource sr = new SharedResource(17);
        Thread t1 = new Thread(() -> System.out.println(
                "Current number: " + sr.getNumber()
        ));
        Thread t2 = new Thread(() -> {
            sr.setNumber(20);
            System.out.println("The number was changed");
        });
        t1.start();
        try {
        Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
