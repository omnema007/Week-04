package collectionframework.mapinterface.keywithhighestvalue;
import java.util.*;

public class MaxValueKeyMain {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        System.out.println("Key with Highest Value: " + MaxValueKey.findKeyWithHighestValue(map));
    }
}
