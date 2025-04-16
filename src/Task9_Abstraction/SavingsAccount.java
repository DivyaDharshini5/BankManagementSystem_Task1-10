package Task9_Abstraction;

public class SavingsAccount extends BankAccount {
	
	  private float interestRate;

	    public SavingsAccount(String accountNumber, String customerName, float balance, float interestRate) {
	        super(accountNumber, customerName, balance);
	        this.interestRate = interestRate;
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
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew ₹" + amount);
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }

	    @Override
	    public void calculateInterest() {
	        float interest = balance * interestRate / 100;
	        balance += interest;
	        System.out.println("Interest of ₹" + interest + " added. New balance: ₹" + balance);
	    }
	}


