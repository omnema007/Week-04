//Test

package collectionframeworktest.mapinterfacetest.invertmaptest;

import collectionframework.mapinterface.invertmap.InvertMap;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class InvertMapTest {
    @Test
    public void test() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> result = InvertMap.invertMap(map);

        List<String> expected = result.get(2);
        Assert.assertEquals(expected, result.get(2));
    }
}
