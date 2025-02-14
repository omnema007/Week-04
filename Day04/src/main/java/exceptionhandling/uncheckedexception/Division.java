package exceptionhandling.uncheckedexception;
import java.util.InputMismatchException;

public class Division {
    public static void division(int a, int b) {
        try {
             int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero."  );
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }

    }
}
