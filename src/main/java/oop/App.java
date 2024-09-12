package oop;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product2 product2 = new Product2("shirt2", 5.99, 1);

        Product2 A1 = new Product2("shirt", 5.99, 1);
        Product2 A2 = new Product2("dress", 25.99, 1);
        Product2 A3 = new Product2("pants", 16.99, 1);
//       Adding the record to the array and assinging it to place in the index
        Product2[] clothing = {A1, A2, A3};
//        ArrrayList<type> name = new ArrayList<>();
//        dynamic way of creating an array
//        <type> would be product2 because that is the array I'm using


        //addition(clothing);
//      Adds/calls the array to the new method
//        Product2(Product);
        //System.out.println(A1.getName());
        printall(clothing);
        setPrice(A1,1000);
//      This will rewrite/update the price within the array/ This can be done for the quantity
        printall(clothing);
//      This will print all of the things within the array
    }

    public static void printall(Product2[] clothing) {
        for (int a = 0; a < clothing.length; a++) {
            System.out.println("Name: " + clothing[a].getName() + ", Price:" + clothing[a].getPrice() + ", Quantity: " +
                    clothing[a].getQuantity());
//            This is how to print everything in the array in one line.
        }
    }

    public static void addition(Product2[] products) {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            double productPrice = products[i].getQuantity() * products[i].getPrice();
//            Try to combine the two methods int one string
            total += productPrice; // total = total + productPrice;

// method which takes product array
// loops through products and calculates sum of their cost
        }
        System.out.println(total);
        // loops through them and prints them out
    }

   public static void setPrice(Product2 product, double price) {
        product.setPrice(price);
   }
}







