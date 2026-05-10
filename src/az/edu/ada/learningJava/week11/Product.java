package az.edu.ada.learningJava.week11;

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
        Product p1 = new Product("P1", 10.23, true);
        System.out.println(p1);
    }
}
