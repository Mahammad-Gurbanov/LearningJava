package az.edu.ada.learningJava.week11;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private String category;
    private double amount;

    public Transaction(String category, double amount){
        this.category = category;
        this.amount = amount;
    }

    public String getCategory(){
        return category;
    }

    public double getAmount(){
        return amount;
    }

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>(List.of(
                new Transaction("Tech", 1000),
                new Transaction("Tech", 2700),
                new Transaction("Grocery", 23.64),
                new Transaction("Grocery", 17.99),
                new Transaction("Rent", 4000),
                new Transaction("Tech", 888)
        ));

        double totalTechTransactionAmount = transactions.stream()
                .filter(t -> t.getCategory().equals("Tech"))
                .mapToDouble(Transaction::getAmount)
                .sum();
        System.out.println(totalTechTransactionAmount);
    }

}
