package lambdas;

import java.util.Arrays;

public class Sorting {
    public static void sortingstrings(String[] strings) {

        Arrays.sort(strings, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s2.charAt(s2.length() - 1) - s1.charAt(s1.length() - 1);
            }
        });
        System.out.println("Sorted array: " + Arrays.toString(strings));
    }
}