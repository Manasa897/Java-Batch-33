package functionalinterfaces;

import static org.junit.Assert.*;

import functionalinterfaces.SortElements;
import org.junit.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortElementsTest {
    @Test
    public void testSortHashMap() {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Cherry", 8);
        unsortedMap.put("Date", 3);
        unsortedMap.put("Fig", 1);

        LinkedHashMap<String, Integer> sortedMap = (LinkedHashMap<String, Integer>) SortElements.sortHashMap(unsortedMap);

        String[] expectedKeys = {"Fig", "Banana", "Date", "Apple", "Cherry"};

        int i = 0;
        for (String key : sortedMap.keySet()) {
            assertEquals(expectedKeys[i], key);
            i++;
        }
    }
}