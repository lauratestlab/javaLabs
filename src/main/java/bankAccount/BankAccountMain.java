package bankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        depositTest();
        depositNegativeTest();
        withddrawTest();
        withdrawNegativeTest();
        transfer();
        transferNegativeTest();

    }

    public static void depositTest() {
        BankAccount bankAccount = new BankAccount(100, "Alice");
        bankAccount.deposit(100);
        assert bankAccount.getBalance() == 200;
        System.out.println("Your current balance is" + " " +bankAccount.getBalance());
    }

    public static void depositNegativeTest() {
        BankAccount bankAccount = new BankAccount(100, "Alice");
        bankAccount.withdraw(-100);
        assert bankAccount.getBalance() == 100;
        System.out.println("Deposit unsuccessful. Your balance is " +bankAccount.getBalance());
    }
    public static void withddrawTest(){
        BankAccount bankAccount = new BankAccount(100, "Alice");
        bankAccount.withdraw(50);
        assert bankAccount.getBalance() == 50;
        System.out.println("Your current balance is " + bankAccount.getBalance());
    }
    public static void withdrawNegativeTest(){
        BankAccount bankAccount = new BankAccount(100, "Alice");
        bankAccount.withdraw(-50);
        assert bankAccount.getBalance() == 100;
        System.out.println( "Withdrawal unsuccessful. Your balance is "  +bankAccount.getBalance());
    }
    public static void transfer(){
        BankAccount bankAccount = new BankAccount(100, "Alice");
        BankAccount bankAcc = new BankAccount(100, "Sam");
        bankAccount.transfer(bankAcc, 50);
        assert bankAccount.getBalance() == 50;
        assert bankAcc.getBalance() == 150;
        System.out.println("You tansfer"+" " + bankAccount.getBalance());
    }
    public static void transferNegativeTest() {
        BankAccount bankAccount = new BankAccount(100, "Sam");
        BankAccount bankAcc = new BankAccount(100, "Alice");

        bankAccount.transfer(bankAcc,-50);
        assert bankAccount.getBalance() == 100;
        assert bankAcc.getBalance() == 100;
        System.out.println("Transfer unsuccessful"+" "+  bankAccount.getBalance());

    }

}
