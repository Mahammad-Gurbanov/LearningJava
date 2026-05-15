package az.edu.ada.learningJava.week12;


import java.util.Random;

public class PolitePerson extends Person {
    private boolean isWalking = false;
    private final Random random = new Random();

    public PolitePerson(String name){
        super(name);
    }

    public boolean hasWalking() {
        return isWalking;

    }

    public void giveWay(PolitePerson other){
        while (!other.hasWalking()){
            System.out.printf("Please %s, you may pass\n", other.getName());
            try {
                Thread.sleep(1000 + random.nextInt(5000));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        isWalking = true;
        System.out.printf("%s has started walking", this.getName());
    }

}
