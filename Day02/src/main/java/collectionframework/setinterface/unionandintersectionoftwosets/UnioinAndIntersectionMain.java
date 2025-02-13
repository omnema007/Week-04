package collectionframework.setinterface.unionandintersectionoftwosets;


import java.util.Arrays;
import java.util.HashSet;

public class UnioinAndIntersectionMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> union = UnionAndIntersection.findUnion(set1, set2);
        System.out.println("Union of Two Sets: " + union);

        HashSet<Integer> intersection = UnionAndIntersection.findIntersection(set1, set2);
        System.out.println("Intersection of Two Sets: " + intersection);
    }
}
