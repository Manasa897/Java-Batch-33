package collection;
import org.junit.Test;
import java.util.ArrayList;
import collections.ConvertToArray;
import static org.junit.Assert.assertArrayEquals;
public class ConvertToArrayTest {
    @Test
    public void testConvertArrayList() {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Element 1");
        list1.add("Element 2");
        list1.add("Element 3");

        String[] result1 = ConvertToArray.convertArrayListToArray(list1);
        String[] expected1 = {"Element 1", "Element 2", "Element 3"};
        assertArrayEquals(expected1, result1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Test Element 1");
        list2.add("Test Element 2");

        String[] result2 = ConvertToArray.convertArrayListToArray(list2);
        String[] expected2 = {"Test Element 1", "Test Element 2"};
        assertArrayEquals(expected2, result2);


    }
}