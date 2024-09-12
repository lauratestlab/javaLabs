package Trade;

public class Tradetest {
    public static void main(String[] args) {
        Trade t1 = new Trade("T1", "APPL", 100, 15.25);
        Account Ac= new Account(10);
//      This an instance of the object Account class
//      I have given the instance a new name Ac
//      Within the new instance it contains the method for the total price
//      totaltradeprice = trade.getPrice() * trade.getQuantity();

        Trader Sam = new Trader("Sam",  Ac);


        Sam.addtrade(t1);
        t1.setPrice(10.00);
//      This is the instance and the "t1.setPrice" is used to access the attribute that
//      I want to display and in this case it is setPrice
        System.out.println(t1);
        System.out.println(Sam.getAccountname().getTotalprice());
    }

}
