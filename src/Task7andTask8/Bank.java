package Task7andTask8;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = null;
        Customer customer = null;
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        customer = new Customer(customerId, firstName, lastName, email, phone, address);

      
        System.out.println("\n--- Customer Information ---");
        System.out.println(customer);

        System.out.println("\nChoose Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter account number: ");
                String savingsAccountNumber = scanner.next();
                System.out.print("Enter initial deposit amount: ₹");
                double savingsBalance = scanner.nextDouble();
                System.out.print("Enter interest rate: ");
                double interestRate = scanner.nextDouble();
                account = new SavingsAccount(savingsAccountNumber, savingsBalance, interestRate);
                break;
            case 2:
                System.out.print("Enter account number: ");
                String currentAccountNumber = scanner.next();
                System.out.print("Enter initial deposit amount: ₹");
                double currentBalance = scanner.nextDouble();
                account = new CurrentAccount(currentAccountNumber, currentBalance);
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }


        
        while (true) {
            System.out.println("\n--- Transaction Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Calculate Interest (Savings Account only)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount); 
                    break;
                case 3:
                    if (account instanceof SavingsAccount) {
                        account.calculateInterest(); 
                    } else {
                        System.out.println("Interest calculation is not available for Current Accounts.");
                    }
                    break;
                case 4:
                  System.out.println("Exiting...");;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        
    }
}

