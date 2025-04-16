package Task10_Association;

import java.util.*;

public class Bank {
    private Map<Long, Account> accounts = new HashMap<>();
    private long nextAccountNumber = 1001;

    public void createAccount(Customer customer, String accType, float balance) {
        Account acc = new Account(nextAccountNumber, accType, balance, customer);
        accounts.put(nextAccountNumber, acc);
        System.out.println("Account created successfully. Account Number: " + nextAccountNumber);
        nextAccountNumber++;
    }

    public float deposit(long accNo, float amount) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.deposit(amount);
            return acc.getAccountBalance();
        }
        System.out.println("Account not found.");
        return -1;
    }

    
    public float withdraw(long accNo, float amount) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.withdraw(amount);
            return acc.getAccountBalance();
        }
        System.out.println("Account not found.");
        return -1;
    }

   
    public float getAccountBalance(long accNo) {
        Account acc = accounts.get(accNo);
        return (acc != null) ? acc.getAccountBalance() : -1;
    }

   
    public void transfer(long fromAcc, long toAcc, float amount) {
        Account from = accounts.get(fromAcc);
        Account to = accounts.get(toAcc);

        if (from != null && to != null) {
            if (from.getAccountBalance() >= amount) {
                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Insufficient balance ");
            }
        } else {
            System.out.println("accounts not found.");
        }
    }

    public void getAccountDetails(long accNo) {
        Account acc = accounts.get(accNo);
        if (acc != null) {
            acc.printDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exists = false;

        while (!exists) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Get Balance\n5. Transfer\n6. Get Account Details\n7. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    String cid = sc.next();
                    System.out.print("First Name: ");
                    String fname = sc.next();
                    System.out.print("Last Name: ");
                    String lname = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Phone (10 digits): ");
                    String phone = sc.next();
                    sc.nextLine(); 
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Account Type (Savings/Current): ");
                    String type = sc.next();
                    System.out.print("Initial Balance: ");
                    float balance = sc.nextFloat();

                    try {
                        Customer customer = new Customer(cid, fname, lname, email, phone, address);
                        bank.createAccount(customer, type, balance);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Account Number: ");
                    long accD = sc.nextLong();
                    System.out.print("Amount: ");
                    float amtD = sc.nextFloat();
                    float newBalD = bank.deposit(accD, amtD);
                    if (newBalD != -1)
                        System.out.println(" New Balance: " + newBalD);
                    break;

                case 3:
                    System.out.print("Account Number: ");
                    long accW = sc.nextLong();
                    System.out.print("Amount: ");
                    float amtW = sc.nextFloat();
                    float newBalW = bank.withdraw(accW, amtW);
                    if (newBalW != -1)
                        System.out.println("New Balance: ₹" + newBalW);
                    break;

                case 4:
                    System.out.print("Account Number: ");
                    long accB = sc.nextLong();
                    float balanceB = bank.getAccountBalance(accB);
                    if (balanceB != -1) System.out.println(" Balance: " + balanceB);
                    else System.out.println("Account not found.");
                    break;

                case 5:
                    System.out.print("From Account: ");
                    long from = sc.nextLong();
                    System.out.print("To Account: ");
                    long to = sc.nextLong();
                    System.out.print("Amount: ");
                    float amount = sc.nextFloat();
                    bank.transfer(from, to, amount);
                    break;

                case 6:
                    System.out.print("Account Number: ");
                    long accDet = sc.nextLong();
                    bank.getAccountDetails(accDet);
                    break;

                case 7:
                    exists = true;
                    System.out.println("Exiting... ");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
