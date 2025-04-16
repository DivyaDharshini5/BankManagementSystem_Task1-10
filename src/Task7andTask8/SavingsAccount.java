package Task7andTask8;

public class SavingsAccount extends Account {
	private double interestRate;
	public SavingsAccount(String accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, "Savings", accountBalance);
        this.interestRate = interestRate;
    }
	 @Override
	    public void calculateInterest() {
	        double interest = getAccountBalance() * (interestRate / 100);
	        setAccountBalance(getAccountBalance() + interest);
	        System.out.println("Interest added: ₹" + interest);
	    }
}
