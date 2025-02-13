package collectionframework.implementbankingsystem;
import java.util.*;

public class BankSystem {
    private HashMap<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add a new account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double oldBalance = accounts.get(accountNumber);
            sortedAccounts.remove(oldBalance);

            double newBalance = oldBalance + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
            System.out.println("Deposited " + amount + " to Account: " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
            System.out.println("Withdrawal request added for Account: " + accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            if (accounts.containsKey(accountNumber)) {
                double balance = accounts.get(accountNumber);
                if (balance >= amount) {
                    sortedAccounts.remove(balance);
                    balance -= amount;
                    accounts.put(accountNumber, balance);
                    sortedAccounts.put(balance, accountNumber);
                    System.out.println("Withdrawn " + amount + " from Account: " + accountNumber);
                } else {
                    System.out.println("Insufficient funds for Account: " + accountNumber);
                }
            }
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " | Balance: " + entry.getKey());
        }
    }
}
