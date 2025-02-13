package collectionframework.listinterface.reverselist;
import java.util.*;

public class ReverseList {
    public static List<Integer> reverse(List<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        return list;
    }
}
