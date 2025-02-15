package junitproblemstest.basicjunitproblemstest.testinglistoperationstest;
import junitproblems.basicjunitproblems.testinglistoperations.ListManager;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
    @Test
    public void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListManager.removeElement(list, 2);
        assertFalse(list.contains(2));
    }

    @Test
    public void testGetSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(3, ListManager.getSize(list));
    }
}
