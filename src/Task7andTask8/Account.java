package Task7andTask8;

public class Account {
private String accountNumber;
private String accountType;
private double accountBalance;
 Account() {
	    }
public Account(String accountNumber, String accountType, double accountBalance) {
	        this.accountNumber = accountNumber;
	        this.accountType = accountType;
	        this.accountBalance = accountBalance;
	    }
		@Override
public String toString() {
			return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountBalance="
					+ accountBalance + "]";
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
 public void deposit(double amount) {
 if (amount > 0) {
accountBalance += amount;
System.out.println("Deposited: " + amount);
} else {
System.out.println("Deposit amount must be greater than zero.");
}
}
 public void withdraw(double amount) {
     if (amount > 0 && amount <= accountBalance) {
         accountBalance -= amount;
         System.out.println("Withdrew: " + amount);
     } else if (amount > accountBalance) {
         System.out.println("Insufficient balance!");
     } else {
         System.out.println("Withdrawal amount must be greater than zero.");
     }
 }
 public void calculateInterest() {
     if ("Savings".equals(accountType)) {
         double interest = accountBalance * 4.5 / 100;
         accountBalance += interest;
         System.out.println("Interest added: " + interest);
     } else {
         System.out.println("Interest calculation only for savings accounts.");
     }
 }
}
