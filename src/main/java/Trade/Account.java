package Trade;

public class Account {

    private double totalprice;

    public Account(double totalprice){
//   Anything that start with 0, push nothing into the constructor
//  This is question 2 it will calculate the total price
        this.totalprice =0;

    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
//        This will update the total price
    }

    public double getTotalprice() {
        return totalprice;

    }
    public String toString(){
        String placeHolder = totalprice + "\n";
        return placeHolder;
    }
}
