package lambdas;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class FilterLetterA {
    public static void filterStrings(List<String> strings, Predicate<String> predicate) {
        List<String> filteredList = new ArrayList<>();
        for (String str : strings) {
            if (!predicate.test(str)) {
                filteredList.add(str);
            }
        }
        System.out.println(filteredList);
    }

}