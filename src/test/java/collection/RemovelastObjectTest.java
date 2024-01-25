package collection;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
public class RemovelastObjectTest {
    @Test
    public void testRemoveLastElement() {
        ArrayList<String> inp = new ArrayList<>();
        inp.add("adding 1st element");
        inp.add("adding 2nd element");
        inp.add("adding 3rd element");
        inp.add("adding 4th element");
        inp.add("adding 5th element");
        inp.add("adding 6th element");

        int initialSize = inp.size();
        inp.remove(initialSize - 1);

        assertFalse(inp.contains("adding 6th element"));
    }

}