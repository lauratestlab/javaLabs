package Trade;

import java.util.Scanner;

public class Trader {
    Scanner scanner =new Scanner(System.in);
    private String name;
    private Account accountname;
// second constructor that allows trade to be created without a price
    public Trader(String name, Account accountname) {
        this.name = name;
        this.accountname = accountname;
    }

    public void addtrade(Trade trade) {
        double totaltradeprice = trade.getPrice() * trade.getQuantity();
        this.accountname.setTotalprice(totaltradeprice);

    }

    public Account getAccountname() {
        return accountname;
    }
    public void setAccountname(Account Account2 ){
        this.accountname = Account2;

    }

    public void setname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
