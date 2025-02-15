package junitproblems.basicjunitproblems.testingexceptionhandling;

public class Division {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
