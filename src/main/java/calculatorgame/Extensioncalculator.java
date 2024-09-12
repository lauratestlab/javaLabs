package calculatorgame;

public class Extensioncalculator {
    public static void main(String[] args) {

        record Inventory (String item, double price) {}
        record Sale (Inventory item, boolean stock, boolean sold) {}
        // Define record for Inventory
        // Use double because the price of items may or may not have decimals
        // use boolean to define if the inventory was sold

        Inventory fries = new Inventory("fries" ,1.99);
        //New variable define as fries
        //fries = boolean stock, boolean = sold
        Sale sale = new Sale(fries, true, false);
        //New variable defined as sale, which in includes the recode/ variable for fries
        //boolean stock replace with true, boolean sold replace with false

        System.out.println( fries);

    }
}
