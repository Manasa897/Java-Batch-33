package lambdas;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import lambdas.Sorting;
public class SortingTest {
    @Test
    public void testSortStrings() {
        String[] input = {"banana", "apple", "kiwi", "grape", "orange"};
        Sorting.sortingstrings(input);
    }
    @Test
    public void testSortStrings1() {
        String[] input = {"banana", "apple", "kiwi", "kiwa", "orange"};
        Sorting.sortingstrings(input);
    }
}