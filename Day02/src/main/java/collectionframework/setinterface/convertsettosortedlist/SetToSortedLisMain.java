package collectionframework.setinterface.convertsettosortedlist;

import java.util.HashSet;
import java.util.TreeSet;

public class SetToSortedLisMain {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(67);

        System.out.println("Unsorted Set: " + set);
        TreeSet<Integer> treeSet = SetToSortedList.convertSetToSorteList(set);
        System.out.println("Sorted Set: " + treeSet);

    }
}
