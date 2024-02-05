import lambdas.CapitalizeAndSortStrings;

import java.util.Arrays;

public class CapitalizeAndSortStringsTest {
    public static void main(String[] args) {
        String[] input1 = {"apple", "banana", "cherry", "date", "fig"};
        testCapitalizeAndSort(input1);

        String[] input2 = {""};
        testCapitalizeAndSort(input2);

        String[] input3 = {"apple", "banana", "#cherry", "date", "fig"};
        testCapitalizeAndSort(input3);
    }
    public static void testCapitalizeAndSort(String[] strings) {
        System.out.println("Original Strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Capitalize the first letter of each string
        for (int i = 0; i < strings.length; i++) {
            strings[i] = CapitalizeAndSortStrings.capitalizeFirstLetter(new String[]{strings[i]});
        }

        // Sort the strings in alphabetical order
        Arrays.sort(strings);

        System.out.println("\nCapitalized and Sorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        System.out.println("------------------------------");
    }
}