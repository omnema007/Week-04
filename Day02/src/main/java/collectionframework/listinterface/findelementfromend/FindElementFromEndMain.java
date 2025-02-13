package collectionframework.listinterface.findelementfromend;

import java.util.Arrays;
import java.util.LinkedList;

public class FindElementFromEndMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));
        int n = 2;

        int result = FindElementFromEnd.findFromEnd(list, n);


        System.out.println("Element from end is: " + result);
    }
}
