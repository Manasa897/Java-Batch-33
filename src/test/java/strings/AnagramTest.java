package strings;

import org.junit.Test;
import strings.Anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void testAreAnagrams() {
        assertTrue(Anagram.anagrams("listen", "silent"));
        assertFalse(Anagram.anagrams("hello", "world"));
        assertFalse(Anagram.anagrams("hello", "holla"));
        assertTrue(Anagram.anagrams("", ""));
    }
    @Test
    public void testareAna(){

        assertFalse(Anagram.anagrams("hello", "world"));
        assertFalse(Anagram.anagrams("hel", "holla"));
    }
}