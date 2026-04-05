package az.edu.ada.learningJava.week8;

public class Account implements Comparable<Account>{
    private String firstName;
    private String lastName;
    private double balance;

    public Account(String firstName, String lastName, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return String.format("First Name: %s, Last Name: %s, Balance: $%.2f",
                firstName, lastName, balance);
    }

    @Override
    public int compareTo(Account otherAccount){
        return Double.compare(balance, otherAccount.getBalance());
    }

}
