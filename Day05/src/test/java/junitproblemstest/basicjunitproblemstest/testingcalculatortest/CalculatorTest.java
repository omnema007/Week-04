package junitproblemstest.basicjunitproblemstest.testingcalculatortest;

import junitproblems.basicjunitproblems.testingcalculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

        Calculator calculator = new Calculator();

        @Test
        public void testAdd() {
            assertEquals(5, calculator.add(2, 3));
            assertEquals(-1, calculator.add(2, -3));
        }

        @Test
        public void testSubtract() {
            assertEquals(1, calculator.subtract(3, 2));
            assertEquals(5, calculator.subtract(2, -3));
        }

        @Test
        public void testMultiply() {
            assertEquals(6, calculator.multiply(2, 3));
            assertEquals(-6, calculator.multiply(2, -3));
        }

        @Test
        public void testDivide() {
            assertEquals(2, calculator.divide(6, 3));
            assertEquals(-2, calculator.divide(6, -3));
        }

        @Test
        public void testDivideByZero() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
            assertEquals("Division by zero is not allowed.", exception.getMessage());
        }
}
