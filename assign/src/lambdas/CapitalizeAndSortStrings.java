package lambdas;

import java.util.Arrays;

public class CapitalizeAndSortStrings {
    public static String capitalizeFirstLetter(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "fig"};

        for (int i = 0; i < strings.length; i++) {
            strings[i] = capitalizeFirstLetter(new String[]{strings[i]});
        }
        Arrays.sort(strings);
        for (String str : strings) {
            System.out.println(str);
        }
        return null;
    }
}