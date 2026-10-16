class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: minimum balance of 100 required");
        }
    }
}

public class Q5_BankAccountSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500);
        account.withdraw(450);
        System.out.println("Balance = " + account.getBalance());
        account.withdraw(200);
    }
}
