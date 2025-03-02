package arrays.fundamentals;

import java.util.Arrays;

public class LeftRotateByOne {

  public static void rotateArrayByOne(int[] nums) {

    int firstElement = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {
      nums[i] = nums[i + 1];
    }
    nums[nums.length - 1] = firstElement;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    rotateArrayByOne(nums);
    System.out.println(Arrays.toString(nums));
  }
}
