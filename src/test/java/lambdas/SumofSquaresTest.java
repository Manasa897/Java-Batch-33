package lambdas;
import lambdas.SumofSquares;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
public class SumofSquaresTest {
    @Test
    public void sumtest(){
        List<Integer> numbers = Arrays.asList(1, -2, 3, -4, 5);
        SumofSquares.sumOfSquaresOfPositiveIntegers(numbers);
    }
}
