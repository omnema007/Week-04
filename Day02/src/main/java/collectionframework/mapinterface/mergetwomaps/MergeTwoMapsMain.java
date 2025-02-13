package collectionframework.mapinterface.mergetwomaps;

import java.util.*;

public class MergeTwoMapsMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        HashMap<String, Integer> mergeMap = MergeTwoMaps.mergeMaps(map1, map2);
        System.out.println(mergeMap);
    }
}
