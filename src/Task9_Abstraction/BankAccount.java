package Task9_Abstraction;


public abstract class BankAccount {
    protected String accountNumber;
    protected String customerName;
    protected float balance;

    public BankAccount() {}

    public BankAccount(String accountNumber, String customerName, float balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getCustomerName() { return customerName; }
    public float getBalance() { return balance; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setBalance(float balance) { this.balance = balance; }

    public abstract void deposit(float amount);
    public abstract void withdraw(float amount);
    public abstract void calculateInterest();

    public String toString() {
        return "Account Number: " + accountNumber +
               "\nCustomer Name: " + customerName +
               "\nBalance: ₹" + balance;
    }
}
