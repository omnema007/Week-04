package collectionframework.implementbankingsystem;

public class BankSystemMain {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        bank.addAccount(101, 5000);
        bank.addAccount(102, 7000);
        bank.addAccount(103, 6000);

        bank.deposit(101, 2000);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(103);

        bank.processWithdrawals(3000);

        bank.displaySortedAccounts();
    }
}
