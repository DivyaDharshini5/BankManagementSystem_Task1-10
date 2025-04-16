package Task10_Association;

public class Account {
	 private long accountNumber;
	    private String accountType;
	    private float accountBalance;
	    private Customer customer;

	    public Account() {}

	    public Account(long accountNumber, String accountType, float accountBalance, Customer customer) {
	        this.accountNumber = accountNumber;
	        this.accountType = accountType;
	        this.accountBalance = accountBalance;
	        this.customer = customer;
	    }

	    public long getAccountNumber() { return accountNumber; }
	    public float getAccountBalance() { return accountBalance; }
	    public String getAccountType() { return accountType; }

	    public void deposit(float amount) {
	        if (amount > 0) accountBalance += amount;
	        else System.out.println("Deposit must be greater than 0");
	    }

	    public void withdraw(float amount) {
	        if (amount > 0 && amount <= accountBalance) accountBalance -= amount;
	        else System.out.println("Insufficient balance or invalid withdrawal");
	    }

	    public void printDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Account Balance: ₹" + accountBalance);
	        System.out.println("Customer Details: \n" + customer);
	    }
}
