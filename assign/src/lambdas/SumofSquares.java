package lambdas;
import java.util.List;

public class SumofSquares {
    public static void sumOfSquaresOfPositiveIntegers(List<Integer> numbers) {
        int sum1= numbers.stream()
                .filter(n -> n > 0)
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sum1);
    }
}
