package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void checkBalance() {
        System.out.println("Your avaible balance is: " + balance);
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Unefficient balance");
            return;
        }

        if (amount <= 0) {
            System.out.println("Withdrawing amount can not be zero or negative");
            return;
        }
        balance -= amount;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
}
