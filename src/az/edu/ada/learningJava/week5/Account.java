package az.edu.ada.learningJava.week5;
import java.util.ArrayList;


public class Account {
    private final int id;
    private final Customer customer;
    private double balance;
    private static final ArrayList<Integer> currentIds = new ArrayList<>();

    public Account(int id, Customer customer, double balance){
        if (currentIds.contains(id)){
            throw new IllegalArgumentException("Please use another id");
        }
        this.id = id;
        currentIds.add(id);
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        if (currentIds.contains(id)){
            throw new IllegalArgumentException("Please use another id");
        }
        this.id = id;
        currentIds.add(id);
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId(){
        return this.id;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

}
