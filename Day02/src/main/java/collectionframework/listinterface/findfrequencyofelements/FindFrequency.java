package collectionframework.listinterface.findfrequencyofelements;
import java.util.Map;
import java.util.HashMap;

public class FindFrequency {
    public static Map<String, Integer> findFrequency(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return map;
    }
}
