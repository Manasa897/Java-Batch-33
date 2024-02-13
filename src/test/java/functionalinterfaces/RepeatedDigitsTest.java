package functionalinterfaces;
import java.util.List;
import org.junit.Test;
import functionalInterfaces.RepeatedDigits;
public class RepeatedDigitsTest {
    @Test
    public void Repeattest(){
        int inputNumber = 667188890;
        List<Integer> result = RepeatedDigits.findRepeatedDigits(inputNumber);
        System.out.println("Repeated digits: " + result);
    }
}