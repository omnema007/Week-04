//Test
package collectionframeworktest.setinterfacetest.unionandintersectionoftwosetstest;

import collectionframework.setinterface.unionandintersectionoftwosets.UnionAndIntersection;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersectionTest {
    @Test
    public void test1() {
        //Test for Union
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> union = UnionAndIntersection.findUnion(set1, set2);
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals(expected, union);
        System.out.println("Test Passed for Union!");
    }

    @Test
    public void test2() {
        //Test for intersection
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> intersection = UnionAndIntersection.findIntersection(set1, set2);
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(3));
        Assert.assertEquals(expected, intersection);
        System.out.println("Test Passed for Intersection!");
    }
}
