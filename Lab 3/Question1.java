import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = input.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String holderName = input.nextLine();

        SavingsAccount account = new SavingsAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountHolderName(holderName);

        System.out.print("Enter Initial Deposit: ");
        double initialDeposit = Double.parseDouble(input.nextLine());
        if (account.deposit(initialDeposit)) {
            System.out.println("Deposited " + initialDeposit + ". New Balance: " + account.getBalance());
        } else {
            System.out.println("Deposit must be a positive amount.");
        }

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = Double.parseDouble(input.nextLine());
        if (account.deposit(depositAmount)) {
            System.out.println("Deposited " + depositAmount + ". New Balance: " + account.getBalance());
        } else {
            System.out.println("Deposit must be a positive amount.");
        }

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawAmount = Double.parseDouble(input.nextLine());
        if (account.withdraw(withdrawAmount)) {
            System.out.println("Withdrawn " + withdrawAmount + ". New Balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Amount must be positive and not more than the balance.");
        }

        account.displayAccountDetails();

        input.close();
    }
}