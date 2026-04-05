package az.edu.ada.learningJava.week8;

public class Account {
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format("First Name: %s, Last Name: %s, Balance: $%.2f",
                firstName, lastName, balance);
    }

}
