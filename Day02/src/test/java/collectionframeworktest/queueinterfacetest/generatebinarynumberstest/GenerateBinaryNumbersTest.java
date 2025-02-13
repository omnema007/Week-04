//Test
package collectionframeworktest.queueinterfacetest.generatebinarynumberstest;

import collectionframework.queueinterface.generatebinarynumbers.GenerateBinaryNumbers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenerateBinaryNumbersTest {
    @Test
    public void test() {
        int n = 5;
        List<String> binaryNumbers = new LinkedList<>(Arrays.asList("1", "10", "11", "100", "101"));

        Assert.assertEquals(binaryNumbers, GenerateBinaryNumbers.generateBinaryNumbers(n));
        System.out.println("Test Passed!");
    }
}
