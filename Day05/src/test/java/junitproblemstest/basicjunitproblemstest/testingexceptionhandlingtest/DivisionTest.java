package junitproblemstest.basicjunitproblemstest.testingexceptionhandlingtest;
import junitproblems.basicjunitproblems.testingexceptionhandling.Division;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DivisionTest {
    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Division.divide(5, 0);
        });
        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void testDivideValid() {
        assertEquals(2, Division.divide(10, 5));
        assertEquals(-3, Division.divide(9, -3));
    }
}
