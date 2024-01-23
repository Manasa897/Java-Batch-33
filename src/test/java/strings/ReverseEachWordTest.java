package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ReverseEachWordTest {
    @Test
    public void testAreReverse() {
        String input = "Hello";
        String expectedOutput = "olleH";

        ReverseEachWord Reverse = new ReverseEachWord();
        String result = ReverseEachWord.reverseWords(input);
        assertEquals(expectedOutput, result);

        String input1 = "Java J2EE Reverse Me";
        String expectedOutput1 = "avaJ EE2J esreveR eM";
        String result1 = ReverseEachWord.reverseWords(input1);
        assertEquals(expectedOutput1, result1);

        String input2 = "";
        String expectedOutput2 = "";
        String result2 = ReverseEachWord.reverseWords(input2);
        assertEquals(expectedOutput2, result2);
    }

}