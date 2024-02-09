package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Capitalize {
    public static void Captial(String[] strings) {
        List<String> capitalizedSortedStrings = Arrays.stream(strings)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        capitalizedSortedStrings.forEach(System.out::println);
    }
}