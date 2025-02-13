package collectionframework.mapinterface.wordfrequencycounter;

import java.util.*;
import java.io.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> findFrequency(String filePath) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert to lowercase and remove punctuation
                String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return wordCount;

    }
}
