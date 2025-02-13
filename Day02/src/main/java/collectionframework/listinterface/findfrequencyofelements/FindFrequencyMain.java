package collectionframework.listinterface.findfrequencyofelements;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyMain {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange"};
        Map<String, Integer> result = FindFrequency.findFrequency(arr);
        System.out.println(result);

    }
}
