import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
            System.out.println("Current Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
            System.out.println("Current Balance after deposit: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void printMiniStatement() {
        System.out.println("Mini Statement:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}