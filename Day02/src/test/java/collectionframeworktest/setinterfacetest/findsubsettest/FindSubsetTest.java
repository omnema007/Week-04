//Test

package collectionframeworktest.setinterfacetest.findsubsettest;

import collectionframework.setinterface.findSubset.FindSubset;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class FindSubsetTest {
    @Test
    public void test() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Assert.assertEquals(true, FindSubset.findSubset(set1, set2));
        System.out.println("Test Passed!");
    }
}
