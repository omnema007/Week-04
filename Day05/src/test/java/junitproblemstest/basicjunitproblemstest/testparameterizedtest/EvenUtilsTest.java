package junitproblemstest.basicjunitproblemstest.testparameterizedtest;


import junitproblems.basicjunitproblems.testparameterized.EvenUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenUtilsTest {

    @Test
    public void testEvenNumbers() {
        assertTrue(EvenUtils.isEven(2));
        assertTrue(EvenUtils.isEven(4));
        assertTrue(EvenUtils.isEven(6));
    }

    @Test
    public void testOddNumbers() {
        assertFalse(EvenUtils.isEven(7));
        assertFalse(EvenUtils.isEven(9));
    }
}
