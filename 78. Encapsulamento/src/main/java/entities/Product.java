package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Constutor
    public Product(String name, double price, int quantity){
        //this e o atibuto do metodo 
        this.name = name;
        this.price=price;
        this.quantity=quantity;
    }

    //Sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price=price;
    }

    //Set
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Gets
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", "
                + "$ " + String.format("%.2f", price) + ", "
                + quantity + " units, "
                + totalValueInStock();
    }
}
