package collectionframework.listinterface.rotateelementsinlist;


import java.util.ArrayList;
import java.util.List;

public class RotateElemetsInListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int k = 2;

        System.out.println("Before Rotate List: " + list);
        List<Integer> result = RotateElementsInList.rotateList(list, k);
        System.out.println("After Rotate List: " + result);
    }
}
