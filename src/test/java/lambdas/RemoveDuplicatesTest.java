package lambdas;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import lambdas.RemoveDuplicates;
public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 3, 12, 6, 1, 7, 8, 9, 9, 10);
        List<Integer> unique = RemoveDuplicates.removeDuplicates(numbers);
        System.out.println(unique);
    }
}