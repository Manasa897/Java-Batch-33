package lambdas;

import java.util.Arrays;

public class Average {
    public static void avg(Integer[] numbers) {
        double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n * n)
                .average()
                .orElse(0);

        System.out.println("Average of squares of all the odd numbers: " + average);
    }
}