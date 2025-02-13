package collectionframework.setinterface.symmetricdifference;

import java.util.Arrays;
import java.util.HashSet;

public class SymmetricDifferenceMain {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        HashSet<Integer> result = SymmetricDiffernce.findSymmetricDifference(set1, set2);
        System.out.println("Symmetric Differnce of Two Sets: " + result);
    }
}
