//Test
package collectionframeworktest.listinterfacetest.rotateelementsinlisttest;

import collectionframework.listinterface.rotateelementsinlist.RotateElementsInList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsInListTest {
    @Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = RotateElementsInList.rotateList(list, 3);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
