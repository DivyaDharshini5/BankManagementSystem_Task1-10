package Task9_Abstraction;


public class CurrentAccount extends BankAccount {
    private static final float OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(String accountNumber, String customerName, float balance) {
        super(accountNumber, customerName, balance);
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (amount > 0 && (balance - amount >= -OVERDRAFT_LIMIT)) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }
}
