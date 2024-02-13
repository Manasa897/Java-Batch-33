package functionalinterfaces;

import java.util.*;

public class SortElements {
    public static HashMap<String, Integer> sortHashMap(HashMap<String, Integer> unsortedMap) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(unsortedMap.entrySet());

        Collections.sort(list, (entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}