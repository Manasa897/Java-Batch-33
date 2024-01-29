package sets;
import sets.Stringshashset;
import org.junit.Test;
import java.util.HashSet;
public class StringshashsetTest {
    private static HashSet<String> stringSet;
    @Test
    public void runTestCases() {
        stringSet = new HashSet<>();

        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Mango");
        stringSet.add("Pineapple");
        stringSet.add("Strawberry");
        stringSet.add("Watermelon");
        stringSet.add("Kiwi");
        stringSet.add("Peach");
        Stringshashset.hashsetloops(stringSet);

    }
    @Test
    public void runTestCasesDuplicate() {
        stringSet = new HashSet<>();

        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Orange");
        stringSet.add("Grapes");
        stringSet.add("Mango");
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Watermelon");
        stringSet.add("Kiwi");
        stringSet.add("Peach");
        Stringshashset.hashsetloops(stringSet);

    }
}