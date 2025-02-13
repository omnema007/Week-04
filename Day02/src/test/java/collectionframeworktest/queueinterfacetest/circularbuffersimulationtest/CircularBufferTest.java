//Test
package collectionframeworktest.queueinterfacetest.circularbuffersimulationtest;


import collectionframework.queueinterface.circularbuffersimulation.CircularBuffer;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CircularBufferTest {
    @Test
    public void testInsert() {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);

        int[] expectedInitial = {1, 2, 3};
        assertArrayEquals(expectedInitial, cb.getBuffer());

        cb.insert(4);
        int[] expectedAfterOverwrite = {2, 3, 4};
        assertArrayEquals(expectedAfterOverwrite, cb.getBuffer());
        System.out.println("Test Passed!");
    }
}
