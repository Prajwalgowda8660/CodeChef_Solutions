class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    // Constructor to initialize the attributes
    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0; // Initial balance is 0
    }

    // Deposit method
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Withdraw method
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }

    // Display account information
    public void getAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance); 
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount(12345, "John Doe");
       
        myaccount.deposit(1000);
        myaccount.withdraw(500);
        myaccount.deposit(200);
        myaccount.getAccountInfo();
    }
}
