//Test
package collectionframeworktest.mapinterfacetest.mergetwomapstest;

import collectionframework.mapinterface.mergetwomaps.MergeTwoMaps;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class MergeTwoMapsTest {
    @Test
    public void test() {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);
        expected.put("C", 4);

        HashMap<String, Integer> result = MergeTwoMaps.mergeMaps(map1, map2);

        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
