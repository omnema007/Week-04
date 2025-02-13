package collectionframework.mapinterface.wordfrequencycounter;

import java.util.Map;

public class WordFrequencyCounterMain {
    public static void main(String[] args) {
        String filePath = "file";

        Map<String, Integer> result = WordFrequencyCounter.findFrequency(filePath);
        System.out.println(result);
    }
}
