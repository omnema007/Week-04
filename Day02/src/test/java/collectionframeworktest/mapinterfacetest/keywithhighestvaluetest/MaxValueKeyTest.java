//Test
package collectionframeworktest.mapinterfacetest.keywithhighestvaluetest;

import collectionframework.mapinterface.keywithhighestvalue.MaxValueKey;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MaxValueKeyTest {
    @Test
    public void test() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 20);
        map.put("B", 20);
        map.put("C", 15);

        Assert.assertEquals("A", MaxValueKey.findKeyWithHighestValue(map));
        System.out.println("Test Passed!");
    }
}
