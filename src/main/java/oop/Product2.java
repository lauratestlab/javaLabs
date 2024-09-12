package oop;

public class Product2 {

    private String name;
    private double price;
    private int quantity;
//  Made the classes private so that it can't be changed
// The constructed name always matches the class name
    public Product2(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
//"This." it is a keyword used to call the data that are in the class product 2
//            This is the outer object
    }

    void print() {
        System.out.println(
                name + " " + price + " " + quantity);
    }
    // Build setters: This is used to update the information in class object

    // Build Getters: This is used to get tailored information from the class object
    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String newName) {
       this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}



