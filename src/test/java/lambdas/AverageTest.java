package lambdas;

import lambdas.Average;
import org.junit.Test;

public class AverageTest {
    @Test
    public void avgtest(){
        Integer[] numbers = {1,23,1,22,56,11,66,44};
        Average.avg(numbers);

    }
}