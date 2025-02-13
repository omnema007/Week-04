//Test
package collectionframeworktest.listinterfacetest.removeduplicatestest;

import collectionframework.listinterface.removeduplicates.RemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesTest {
    @Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));
        LinkedHashSet<Integer> result = RemoveDuplicates.removeDuplicates(list);
        LinkedHashSet<Integer> expected = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
