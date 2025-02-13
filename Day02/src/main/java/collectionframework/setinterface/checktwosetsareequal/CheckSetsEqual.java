package collectionframework.setinterface.checktwosetsareequal;

import java.util.HashSet;

public class CheckSetsEqual {
    public static boolean areEquals(HashSet<Integer> set1, HashSet<Integer> set2) {

        if (set1.size() != set2.size()) {
            return false;
        }

        for (Integer s1 : set1) {
            if (!set2.contains(s1)) {
                return false;
            }
        }

        return true;
    }
}
