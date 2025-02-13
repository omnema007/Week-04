//Test
package collectionframeworktest.mapinterfacetest.wordfrequencycounttest;

import collectionframework.mapinterface.wordfrequencycounter.WordFrequencyCounter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class WordFrequencyCounterTest {
    @Test
    public void test() {
        String filePath = "file";
        Map<String, Integer> result = WordFrequencyCounter.findFrequency(filePath);

        int expected = result.get("hello");
        Assert.assertEquals(2, expected);
        System.out.println("Test Passed!");
    }
}
