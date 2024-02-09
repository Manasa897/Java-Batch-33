package lambdas;
import lambdas.Capitalize;
import org.junit.Test;

public class CapitalizeTest {
    @Test
    public void captitaltest() {
        String[] strings = {"apple", "banana", "orange", "kiwi", "grape"};
        Capitalize.Captial(strings);

    }
}