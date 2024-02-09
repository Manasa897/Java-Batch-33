package lambdas;

import java.util.Arrays;
import java.util.List;
import lambdas.DoubleEvenNumbers;
import org.junit.Test;

public class DoubleEvenNumbersTest {
    @Test
    public void doubleeventest(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        DoubleEvenNumbers.doubleeven(numbers);
    }
}
