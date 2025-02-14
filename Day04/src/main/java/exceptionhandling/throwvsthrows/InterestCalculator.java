package exceptionhandling.throwvsthrows;

public class InterestCalculator {
    public static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }

        return amount * rate * years / 100;
    }
}
