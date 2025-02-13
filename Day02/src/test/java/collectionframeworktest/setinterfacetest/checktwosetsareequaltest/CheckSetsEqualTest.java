//Test

package collectionframeworktest.setinterfacetest.checktwosetsareequaltest;

import collectionframework.setinterface.checktwosetsareequal.CheckSetsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

public class CheckSetsEqualTest {
    @Test
    public void test() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(5);
        set1.add(6);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(4);

        Assert.assertEquals(true, CheckSetsEqual.areEquals(set1, set2));
        System.out.println("Test Passed!");
    }
}
