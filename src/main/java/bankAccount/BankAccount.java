package bankAccount;

public class BankAccount {
    //constructor
    public BankAccount(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    private int balance;
    private String name;


    public int withdraw(int amount) {
        if (amount <= 0) {
            return 0;
        }
        else {
            balance -= amount;
            return amount;
        }
    }
    public int deposit(int amount) {
        if (amount <= 0) {
            return 0;
        }
        else {
            balance += amount;
            return amount;
        }
    }
    public boolean transfer(BankAccount receiver, int amount) {
        int toTransfer = this.withdraw(amount);
        receiver.deposit(toTransfer);

        if (toTransfer <= 0) {
            System.out.println("You cannot transfer zero or a negative amount");
            return false;
        }
        else
            return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
