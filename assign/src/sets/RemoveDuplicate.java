package sets;
import java.util.LinkedHashSet;
public class RemoveDuplicate {

    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}