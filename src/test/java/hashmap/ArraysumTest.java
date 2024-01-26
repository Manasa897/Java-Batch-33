package hashmap;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArraysumTest {
    @Test
    public void testcase1() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected={3,5};
        int[] result = Arraysum.twoSumIndices(nums,target);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testcase2() {
        int[] nums = {10, 20, 30};
        int target = 100;
        int[] expected={};
        int[] result = Arraysum.twoSumIndices(nums,target);
        assertArrayEquals(expected, result);
    }
}