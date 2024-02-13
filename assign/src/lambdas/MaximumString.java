package lambdas;
import java.util.List;
public class MaximumString {
    public static String findMaxString(List<String> stringList) {
        return stringList.stream()
                .max(String::compareToIgnoreCase)
                .orElse(null);
    }
}