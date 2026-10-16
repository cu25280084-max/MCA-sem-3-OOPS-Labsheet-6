abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Savings withdrawal denied");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class Q8_AbstractBankAccount {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(100);
        savings.showBalance();

        BankAccount current = new CurrentAccount(500);
        current.deposit(200);
        current.withdraw(600);
        current.showBalance();
    }
}
