package Inheritance;

public class BankAccount {
    private int Balance;
    private int Account;

    public BankAccount(int Balance, int Account){
        this.Balance=Balance;
        this.Account=Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public int getAccount() {
        return Account;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public int getBalance() {
        return Balance;
    }
}
