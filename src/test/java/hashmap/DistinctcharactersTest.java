package hashmap;
import org.junit.Test;
public class DistinctcharactersTest {
    @Test
    public void countCharacters_ValidInput() {

        String input = "test string";
        Distinctcharacters.charcount(input);
    }
    @Test
    public void countCharacters_space() {

        String input = " ";
        Distinctcharacters.charcount(input);
    }
}