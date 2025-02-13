//Test
package collectionframeworktest.setinterfacetest.symmetricdifferencetest;

import collectionframework.setinterface.symmetricdifference.SymmetricDiffernce;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceTest {
    @Test
    public void test() {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> result = SymmetricDiffernce.findSymmetricDifference(set1, set2);
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 4, 5));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
