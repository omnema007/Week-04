package collectionframework.setinterface.findSubset;

import java.util.HashSet;

public class FindSubset {
    public static boolean findSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        for (Integer ele : set1) {
            if (!set2.contains(ele)) {
                return false;
            }
        }

        return true;
    }
}
