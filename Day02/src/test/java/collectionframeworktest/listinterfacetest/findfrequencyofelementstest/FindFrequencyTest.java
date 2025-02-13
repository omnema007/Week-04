//Test
package collectionframeworktest.listinterfacetest.findfrequencyofelementstest;

import collectionframework.listinterface.findfrequencyofelements.FindFrequency;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class FindFrequencyTest {
    @Test
    public void test() {
        String[] arr = {"apple", "orange", "apple"};
        Map<String, Integer> result = FindFrequency.findFrequency(arr);

        int expected = result.get("apple");
        Assert.assertEquals(2, expected);
        System.out.println("Test Passes!");
    }
}
