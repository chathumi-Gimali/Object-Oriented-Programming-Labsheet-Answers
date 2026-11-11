public class SavingsAccount {
    // Private so nothing outside the class can change them directly
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public SavingsAccount() {
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter only, no setter, so balance can't be set directly
    public double getBalance() {
        return balance;
    }

    // Returns true if the deposit was accepted
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Returns true if the withdrawal succeeded
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void displayAccountDetails() {
        System.out.println("\nFinal Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}