//Test
package collectionframeworktest.listinterfacetest.findelementfromendtest;

import collectionframework.listinterface.findelementfromend.FindElementFromEnd;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class FindElementFromEndTest {
    @Test
    public void test() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(2, FindElementFromEnd.findFromEnd(list, 4));
        System.out.println("Test Passed!");
    }
}
