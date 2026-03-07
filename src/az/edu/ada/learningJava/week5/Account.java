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

    public String getCustomerName(){
        return this.customer.getName();
    }

    @Override
    public String toString(){
        return String.format("%s(%d) balance=$%.2f", this.customer.getName(),
                this.id, this.balance);
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be " +
                    "positive");
        }
        this.balance += amount;
    }

    public void withdraw(double amount){
        if (this.balance >= amount) this.balance -= amount;
        else {
            throw new IllegalArgumentException("Insufficient balance, can't " +
                    "withdraw money");
        }
    }

}
