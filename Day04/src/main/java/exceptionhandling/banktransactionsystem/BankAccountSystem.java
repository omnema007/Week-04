package exceptionhandling.banktransactionsystem;

public class BankAccountSystem {
    private double balance;

    public BankAccountSystem(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}
