class Account {

    int accountNumber;
    double balance;

    // Static variables for bank-wide tracking
    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    // Constructor
    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

        // Update static variables
        totalAccounts++;
        totalBankBalance += balance;
    }

    // Static method to display bank summary
    static void displayBankSummary() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account(101, 5000);
        Account a2 = new Account(102, 7000);
        Account a3 = new Account(103, 3000);

        Account.displayBankSummary();
    }
}
