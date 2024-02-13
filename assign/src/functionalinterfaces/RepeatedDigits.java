package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class RepeatedDigits {
    public static List<Integer> findRepeatedDigits(int number) {
        List<Integer> repeatedDigits = new ArrayList<>();
        int[] digitCount = new int[10];

        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 1) {
                repeatedDigits.add(i);
            }
        }
        return repeatedDigits;
    }
}