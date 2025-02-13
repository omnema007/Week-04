//Test
package collectionframeworktest.queueinterfacetest.reversequeuetest;

import collectionframework.queueinterface.reversequeue.ReverseQueue;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueTest {
    @Test
    public void test() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3));
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(3, 2, 1));

        Assert.assertEquals(expected, ReverseQueue.reverse(queue));
        System.out.println("Test Passed!");

    }
}
