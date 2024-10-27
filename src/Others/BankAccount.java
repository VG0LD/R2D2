package Others;

public class BankAccount {
    String accountNumber;
    double Balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        Balance = balance;
    }

    void deposit (double amount) {
        Balance += amount;
    }
    void withdraw (double amount) {
        if (amount <= Balance) {
            Balance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
    }

    void getAccountInfo () {
        System.out.println("Account number: " + accountNumber + "; Statement: " + Balance + "$");
    }

}
