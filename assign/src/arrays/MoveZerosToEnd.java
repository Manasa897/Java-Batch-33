package arrays;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 6, 0};
        moveZerosToEnd(numbers);

        System.out.println("Array after moving zeros to the end:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    public static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}