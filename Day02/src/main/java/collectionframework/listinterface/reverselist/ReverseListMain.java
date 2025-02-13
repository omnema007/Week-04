package collectionframework.listinterface.reverselist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("ArrayList Reverse: " + ReverseList.reverse(list));

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));


        System.out.println("Linked List Reverse: " + ReverseList.reverse(linkedList));
    }

}
