package az.edu.ada.learningJava.week8;
import java.util.ArrayList;
import java.util.Comparator;

public class TestSolutions {
    public static void main(String[] args) {
        Account account1 = new Account("J", "M", 123.45);
        Account account2 = new Account("A", "Z", 999);
        Account account3 = new Account("B", "C", 12.45);
        Account account4 = new Account("ABC", "XYZ", 123.45);
        Account account5 = new Account("ABC", "XYZ", 9999);
        Account account6 = new Account("ABC", "XYZ", 99);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);
        for (Account account : accounts){
            System.out.println(account);
        }

        System.out.println("Default Sorted Accounts");
        accounts.sort(null);
        for (Account account : accounts){
            System.out.println(account);
        }

        Comparator<Account> compareFirstLastName = new Comparator<>(){
            @Override
            public int compare(Account acc1, Account acc2){
                if (acc1.getFirstName().equals(acc2.getFirstName()) &&
                    acc1.getLastName().equals(acc2.getLastName())){
                    return Double.compare(acc1.getBalance(), acc2.getBalance());
                }
                else if (acc1.getFirstName().equals(acc2.getFirstName())){
                    return acc1.getLastName().compareTo(acc2.getLastName());
                }
                return acc1.getFirstName().compareTo(acc2.getFirstName());
            }
        };
        System.out.println("Sorted accounts by first, last name and balance");
        accounts.add(account6);
        accounts.sort(compareFirstLastName);
        for (Account account : accounts){
            System.out.println(account);
        }
    }

}
