package az.edu.ada.learningJava.week11;


import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;

public class Product {
    private String name;
    private double price;
    private boolean inStock;

    public Product(String name, double price, boolean inStock){
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean isInStock(){
        return inStock;
    }

    @Override
    public String toString(){
        return String.format(
                "name: %s, price: %.2f, in stock: %b",
                name, price, inStock
        );
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
           new Product("Mouse", 200.99, true),
           new Product("Cup", 9.99, true),
           new Product("LightSaber", 100, false),
           new Product("NoteBook", 3.45, true),
           new Product("Pen", 0.73, true)
        ));

        Predicate<Product> isAffordable = (p) -> (p.getPrice() < 50 && p.isInStock());
        products.removeIf(isAffordable.negate());
        products.forEach(System.out::println);
    }
}
