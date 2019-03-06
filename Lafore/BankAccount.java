package Lafore;

public class BankAccount {
    private double balance;


    public BankAccount(double openingBalance) { //Constructor.
        balance = openingBalance;
    }

    public void deposit(double amount) { //Vnesenie sredstv.
        balance += amount;
    }

    public void withdraw(double amount) { //Withdrawal.
        balance -= amount;
    }

    public void display() { //Show balance.]
        System.out.println("Balance is: " + balance);
    }
}

class BankApp {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.00);

        System.out.println("Before transactions: ");
        ba1.display();
        ba1.deposit(74.35);
        ba1.withdraw(20.00);
        System.out.println("After transactions: ");
        ba1.display();
    }
}

