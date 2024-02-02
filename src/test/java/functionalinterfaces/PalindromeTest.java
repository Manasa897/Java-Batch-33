package functionalinterfaces;

import org.junit.Test;
import functionalinterfaces.Palindrome;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
public class PalindromeTest {
    @Test
    public void checkpalindrometest(){
        int input1=121;
        int result=Palindrome.checkpalindrome(input1);
        assertEquals(input1,result);
    }
    @Test
    public void checkpalindrometest1(){
        int input1=6789876;
        int result=Palindrome.checkpalindrome(input1);
        assertEquals(input1,result);
    }
}