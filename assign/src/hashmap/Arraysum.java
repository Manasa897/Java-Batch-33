package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Arraysum {
    public static int[] twoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (num.containsKey(complement)) {
                return new int[]{num.get(complement), i};
            }
            num.put(nums[i], i);
        }
        return new int[]{};
    }
}