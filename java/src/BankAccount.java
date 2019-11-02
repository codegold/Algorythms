package src;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void displayBalance() {
        System.out.println("balance is: " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100);
        ba1.displayBalance();
        ba1.deposit(87.35);
        ba1.withdraw(55.15);
        ba1.displayBalance();
    }
}
