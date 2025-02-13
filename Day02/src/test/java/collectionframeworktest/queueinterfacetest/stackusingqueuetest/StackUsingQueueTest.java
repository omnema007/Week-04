//Test
package collectionframeworktest.queueinterfacetest.stackusingqueuetest;

import collectionframework.queueinterface.stackusingqueue.StackUsingQueues;
import org.junit.Assert;
import org.junit.Test;

public class StackUsingQueueTest {
    @Test
    public void test() {
        StackUsingQueues.push(1);
        StackUsingQueues.push(2);
        StackUsingQueues.push(3);

        Assert.assertEquals(3, StackUsingQueues.pop());
        System.out.println("Test Passed!");
    }
}
