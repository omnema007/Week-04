package collectionframework.mapinterface.keywithhighestvalue;

import java.util.*;

public class MaxValueKey {
    public static String findKeyWithHighestValue(HashMap<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}
