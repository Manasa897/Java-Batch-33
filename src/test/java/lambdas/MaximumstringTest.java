package lambdas;
import java.util.List;
import lambdas.MaximumString;
import org.junit.Test;

public class MaximumstringTest {
    @Test
    public void maxstringtest() {
        List<String> stringList = List.of("vijaya", "zebra", "lakshmi", "punuru");
        String maxString = MaximumString.findMaxString(stringList);

        if (maxString != null) {
            System.out.println("Maximum element: " + maxString);
        } else {
            System.out.println("List is empty");
        }
    }
    @Test
    public void maxstringtestduplicates() {
        List<String> stringList = List.of("Anamika", "oananaaaa", "oananaaaa", "monika");
        String maxString = MaximumString.findMaxString(stringList);

        if (maxString != null) {
            System.out.println("Maximum element: " + maxString);
        } else {
            System.out.println("List is empty");
        }
    }
}