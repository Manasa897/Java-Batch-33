package functionalinterfaces;

import java.util.HashMap;

public class Uniquewords {

    public static int countUniqueWords(String sentence) {
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("\\s+");
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }
        int uniqueWordCount = 0;
        for (int count : wordFrequencyMap.values()) {
            if (count == 1) {
                uniqueWordCount++;
            }
        }
        return uniqueWordCount;
    }
}