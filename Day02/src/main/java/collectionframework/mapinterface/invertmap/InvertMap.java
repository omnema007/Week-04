package collectionframework.mapinterface.invertmap;

import java.util.*;

public class InvertMap {
    public static Map<Integer, List<String>> invertMap(HashMap<String, Integer> map) {
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (String key : map.keySet()) {
            int value = map.get(key);

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            // Add the key to the list
            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }
}
