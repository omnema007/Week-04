package collectionframework.mapinterface.mergetwomaps;

import java.util.HashMap;

public class MergeTwoMaps {
    public static HashMap<String, Integer> mergeMaps(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> mergedMap = new HashMap<>(map1);

        for (String key : map2.keySet()) {
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + map2.get(key));
        }

        return mergedMap;
    }
}
