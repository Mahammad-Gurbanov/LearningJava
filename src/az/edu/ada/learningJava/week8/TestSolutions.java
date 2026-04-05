package az.edu.ada.learningJava.week8;
import java.util.ArrayList;

public class TestSolutions {
    public static void main(String[] args) {
        Account account1 = new Account("J", "M", 123.45);
        Account account2 = new Account("A", "Z", 999);
        Account account3 = new Account("B", "C", 12.45);
        Account account4 = new Account("ABC", "XYZ", 123.45);
        Account account5 = new Account("ABC", "XYZ", 9999);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        for (Account account : accounts){
            System.out.println(account);
        }

        System.out.println("Sorted Accounts");
        accounts.sort(null);
        for (Account account : accounts){
            System.out.println(account);
        }

    }

}
