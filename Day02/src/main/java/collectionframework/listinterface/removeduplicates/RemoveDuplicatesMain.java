package collectionframework.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));

        System.out.println("Before Remove Duplicates: " + list);
        LinkedHashSet<Integer> result = RemoveDuplicates.removeDuplicates(list);
        System.out.println("After Remove Duplicates: " + result);
    }
}
