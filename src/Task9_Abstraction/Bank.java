package Task9_Abstraction;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("--- Create Account ---");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int type = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        float balance = scanner.nextFloat();

        switch (type) {
            case 1:
                System.out.print("Enter Interest Rate (%): ");
                float rate = scanner.nextFloat();
                account = new SavingsAccount(accNo, name, balance, rate);
                break;
            case 2:
                account = new CurrentAccount(accNo, name, balance);
                break;
            default:
                System.out.println("Invalid account type.");
                return;
        }

        boolean run = true;
        while (run) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    float deposit = scanner.nextFloat();
                    account.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    float withdraw = scanner.nextFloat();
                    account.withdraw(withdraw);
                    break;
                case 3:
                    account.calculateInterest();
                    break;
                case 4:
                    System.out.println(account.toString());
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
