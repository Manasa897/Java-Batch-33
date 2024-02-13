package functionalinterfaces;

import functionalinterfaces.Uniquewords;
import org.junit.Test;
public class UniquewordsTest {
    @Test
    public void uniquetest() {
        String testCases = "abc abc";

        int uniqueWordCount = Uniquewords.countUniqueWords(testCases);
        System.out.println("Unique words count = " + uniqueWordCount);
    }
    @Test
    public void uniquetest1() {
        String testCases = " ";

        int uniqueWordCount = Uniquewords.countUniqueWords(testCases);
        System.out.println("Unique words count = " + uniqueWordCount);
    }
    @Test
    public void uniquetest2() {
        String testCases = "";

        int uniqueWordCount = Uniquewords.countUniqueWords(testCases);
        System.out.println("Unique words count = " + uniqueWordCount);
    }
}