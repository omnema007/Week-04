package collectionframework.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class RemoveDuplicates {
    public static LinkedHashSet<Integer> removeDuplicates(ArrayList<Integer> list) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < list.size(); i++) {
            linkedHashSet.add(list.get(i));
        }

        return linkedHashSet;
    }
}
