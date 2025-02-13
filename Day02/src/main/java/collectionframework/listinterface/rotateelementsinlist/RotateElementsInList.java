package collectionframework.listinterface.rotateelementsinlist;

import java.util.List;

public class RotateElementsInList {
    public static void reverse(List<Integer> list, int i, int j) {

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();

        k %= n;

        reverse(list, 0, k-1);
        reverse(list, k, n-1);
        reverse(list, 0, n-1);

        return list;
    }
}
