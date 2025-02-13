package collectionframework.setinterface.symmetricdifference;

import java.util.HashSet;

public class SymmetricDiffernce {
    public static HashSet<Integer> findUnion(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer s1 : set1) {
            set.add(s1);
        }

        for (Integer s2 : set2) {
            set.add(s2);
        }

        return set;
    }

    public static HashSet<Integer> findIntersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> set = new HashSet<>();

        for (Integer s1 : set1) {
            if (set2.contains(s1)) {
                set.add(s1);
            }
        }

        return set;
    }

    public static HashSet<Integer> findSymmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> union = findUnion(set1, set2);
        HashSet<Integer> intersection = findIntersection(set1, set2);

        for (Integer ele : intersection) {

                union.remove(ele);

        }

        return union;
    }
}
