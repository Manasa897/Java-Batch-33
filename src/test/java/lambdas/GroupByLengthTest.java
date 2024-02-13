package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lambdas.GroupByLength;
import org.junit.Test;
public class GroupByLengthTest {
    @Test
    public void groupbyleng() {
        List<String> strings = Arrays.asList("manasa", "manasa", "pear", "hell", "grape");

        Map<Integer, List<String>> groupedByLength = GroupByLength.groupByLen(strings);

        groupedByLength.forEach((length, words) -> {
            System.out.println("Length " + length + " and the words are " + words);
        });
    }
    @Test
    public void groupbylengtest() {
        List<String> strings = Arrays.asList("hello","he lo");

        Map<Integer, List<String>> groupedByLength = GroupByLength.groupByLen(strings);

        groupedByLength.forEach((length, words) -> {
            System.out.println("Length " + length + " and the words are " + words);
        });
    }
}
