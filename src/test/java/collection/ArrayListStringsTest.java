package collection;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ArrayListStringsTest {
    @Test
    public void testArrayListTraversal() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Test Element 1");
        testList.add("Test Element 2");
        testList.add("Test Element 3");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < testList.size(); i++) {
            result.add("Element at index " + i + ": " + testList.get(i));
        }

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Element at index 0: Test Element 1");
        expected.add("Element at index 1: Test Element 2");
        expected.add("Element at index 2: Test Element 3");

        assertEquals(expected, result);
    }

}