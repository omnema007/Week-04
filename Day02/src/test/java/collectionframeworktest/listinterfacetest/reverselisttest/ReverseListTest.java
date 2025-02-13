//Test
package collectionframeworktest.listinterfacetest.reverselisttest;

import collectionframework.listinterface.reverselist.ReverseList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ReverseListTest {
    @Test
    public void test1() {
        //Test for ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        List<Integer> result = ReverseList.reverse(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passesd!");
    }

    @Test
    public void test2() {
        //Test for LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> result = ReverseList.reverse(linkedList);
        List<Integer> expected = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));
        Assert.assertEquals(expected, result);
        System.out.println("Test Passed!");
    }
}
