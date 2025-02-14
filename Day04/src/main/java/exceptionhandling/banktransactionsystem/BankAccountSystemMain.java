package exceptionhandling.banktransactionsystem;
import java.util.Scanner;

public class BankAccountSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountSystem account = new BankAccountSystem(1000.0);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            sc.close();
        }
    }
}
