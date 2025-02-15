package junitproblems.basicjunitproblems.testingcalculator;

public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed.");
            }
            return a / b;
        }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test the add method
        System.out.println("Addition: " + calculator.add(5, 3)); // Output: 8

        // Test the subtract method
        System.out.println("Subtraction: " + calculator.subtract(5, 3)); // Output: 2

        // Test the multiply method
        System.out.println("Multiplication: " + calculator.multiply(5, 3)); // Output: 15

        // Test division by zero
        try {
            System.out.println("Division by zero: " + calculator.divide(5, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Division by zero is not allowed.
        }

    }
}
