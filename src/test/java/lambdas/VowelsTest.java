package lambdas;
import lambdas.Vowels;
import org.junit.Test;

public class VowelsTest {
    @Test
    public void voweltest() {
        String[] strings = {"hello", "manasa", "lakshmi", "world", "program","aeiou"};

        for (String str : strings) {
            int count = Vowels.countVowels(str);
            if (count > 0) {
                System.out.println( ""+ str + ", and the number of vowels are: " + count);
            }
        }
    }
    @Test
    public void voweltest1() {
        String[] strings = {};

        for (String str : strings) {
            int count = Vowels.countVowels(str);
            if (count > 0) {
                System.out.println( ""+ str + ", and the number of vowels are: " + count);
            }
        }
    }
}