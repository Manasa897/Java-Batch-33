package lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class DoubleEvenNumbers {
    public static void doubleeven(List<Integer> numbers){
        List<Integer> doubledFilteredNumbers = numbers.stream()
                .filter(n -> (n % 2) == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Filtered and Doubled Numbers: " + doubledFilteredNumbers);
    }
}