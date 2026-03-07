package az.edu.ada.learningJava.week5;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(123, "ABC", 'm');
        Account a1 = new Account(1, c1, 123.4);
        a1.deposit(100);
        a1.withdraw(12);
        System.out.println(a1.getBalance());
    }
}
