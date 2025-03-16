package arrays.faqmedium;

import java.util.Arrays;

public class Sort012 {

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void sortZeroOneTwo(int[] nums) {

    int first = 0;
    int last = nums.length - 1;
    int current = 0;

    while (current <= last) {
      if (nums[current] == 0) {
        swap(nums, first, current);
        first++;
        current++;
      } else if (nums[current] == 2) {
        swap(nums, current, last);
        last--;
      } else {
        current++;
      }
    }

  }

  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 2, 1, 0, 0 };
    System.out.println(Arrays.toString(nums));
    sortZeroOneTwo(nums);
    System.out.println(Arrays.toString(nums));
  }

}
