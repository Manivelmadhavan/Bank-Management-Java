import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount account = new BankAccount(10000.0);
        System.out.println("Welcome To Bank Management System");
        System.out.println("Your Initial Balance is 10000.00");
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choose an option: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = s.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;
                case 4:
                    account.printMiniStatement();
                    break;
                case 5:
                    System.out.println("Thank you Exiting...");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}