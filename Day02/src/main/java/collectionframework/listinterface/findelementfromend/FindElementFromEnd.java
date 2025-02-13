package collectionframework.listinterface.findelementfromend;

import java.util.Collections;
import java.util.LinkedList;

public class FindElementFromEnd {
    public static int findFromEnd(LinkedList<Integer> list, int n) {

        Collections.reverse(list);

        return list.get(n-1);


    }
}
