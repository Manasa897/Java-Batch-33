package strings;

import org.junit.Test;
import org.junit.Assert;
import strings.Vowels;

import static org.junit.Assert.assertEquals;
public class VowelsTest {
    @Test
    public void testAreVowels() {
        String input = "Hello";

        int result = Vowels.countvow(input);
        assertEquals(2, result);

        String input1 = "Java J2EE Reverse Me";
        int result1 = Vowels.countvow(input1);
        assertEquals(8, result1);

        String input2 = "";
        int result2 = Vowels.countvow(input2);
        assertEquals(0, result2);
    }

}