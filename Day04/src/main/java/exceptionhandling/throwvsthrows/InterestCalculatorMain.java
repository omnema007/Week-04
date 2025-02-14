package exceptionhandling.throwvsthrows;

import java.util.Scanner;

public class InterestCalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the amount: ");
            double amount = sc.nextDouble();

            System.out.println("Enter the rate: ");
            double rate = sc.nextDouble();

            System.out.println("Enter the years: ");
            int years = sc.nextInt();

            System.out.println(InterestCalculator.calculateInterest(amount, rate, years));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
