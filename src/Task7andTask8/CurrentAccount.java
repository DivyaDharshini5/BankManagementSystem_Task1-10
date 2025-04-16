package Task7andTask8;

public class CurrentAccount extends Account{
	private static final double OVERDRAFT_LIMIT = 5000;
	public CurrentAccount(String accountNumber, double accountBalance) {
        super(accountNumber, "Current", accountBalance);
    }
	public void withdraw(double amount) {
        if (amount > 0 && (getAccountBalance() + OVERDRAFT_LIMIT) >= amount) {
            setAccountBalance(getAccountBalance() - amount);
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance ");
        }
    }
}

