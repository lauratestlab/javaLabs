package Trade;

public class Trade {
    private String ID;
    private String Symbol;
    private int Quantity;
    private double Price;

// Theses are variables/ attributes

    public Trade(String ID, String Symbol, int Quantity, double Price) {
//    This is the function and within the function the initialized variables can be any name

        this.ID = ID;
        this.Symbol = Symbol;
        this.Quantity = Quantity;
        this.Price = Price;
//    This is the constructor
//    (This.) calls the private variable
//    Everything that is called gets a value
    }

    public Trade(String ID, String Symbol, int Quantity) {
//   This the second class within the same file it just can't be in the same
//   This method overloading note that there is one less variable/attribute in this method
        this.ID = ID;
        this.Symbol = Symbol;
        this.Quantity = Quantity;
        this.Price = 0;
    }
        public String toString () {
            String total = ID + "\n" + Symbol + "\n" + Quantity + "\n" + Price;
//   This is the toString method
            return total;
        }

        public String getID () {
            return ID;
        }

        public String getSymbol () {
            return Symbol;
        }

        public int getQuantity () {
            return Quantity;
        }

        public double getPrice () {
            return Price;
        }

        public void setPrice ( double price){

            if (price < 0) {
                Price = 1;
            } else {
                Price = price;
//      The if else statement set the prices to only positive values
            }

        }

        public void setQuantity ( int quantity){
            Quantity = quantity;
        }

        public void setID (String ID){
            this.ID = ID;
        }

        public void setSymbol (String symbol){
            Symbol = symbol;
        }


    }
