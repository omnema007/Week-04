//Test
package collectionframeworktest.setinterfacetest.convertsettosortedlisttest;

import collectionframework.setinterface.convertsettosortedlist.SetToSortedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetToSortedListTest {
    @Test
    public void test() {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(2, 5, 8, 5, 7));
        TreeSet<Integer> result = SetToSortedList.convertSetToSorteList(set);

        TreeSet<Integer> expected = new TreeSet<>(Arrays.asList(2, 5, 5, 7, 8));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
