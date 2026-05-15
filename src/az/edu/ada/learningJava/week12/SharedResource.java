package az.edu.ada.learningJava.week12;

public class SharedResource {
    private int num;
    private boolean bChanged = false;

    public SharedResource(int num){
        this.num = num;
    }

    public synchronized int getNumber(){
        while (!bChanged){
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Err" + e.getMessage());
            }
        }
        return num;
    }

    public synchronized void setNumber(int num){
        bChanged = true;
        this.num = num;
        notify();
    }
}
