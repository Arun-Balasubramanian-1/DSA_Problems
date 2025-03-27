package arrays.faqhard;

import java.util.Arrays;

public class RepeatingAndMissingNumber {

  // array iteration - n*2
  // math formula
  public static int[] findMissingRepeatingNumbers(int[] nums) {
    int dup = 0;
    int missing = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] == nums[j]) {
          dup = nums[i];
          break;
        }
      }
      if (dup > 0) {
        break;
      }
    }

    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += nums[i];
    }

    int nSum = n * (n + 1) / 2;
    missing = (nSum + dup - sum);
    return new int[] { dup, missing };
  }

  public static int[] findMissingRepeatingNumbers2(int[] nums) {
    int n = nums.length;
    int[] map = new int[n + 1];
    int dup = -1;
    int missing = -1;
    for (int element : nums) {
      map[element] += 1;
    }
    for (int i = 1; i <= nums.length; i++) {
      if (map[i] == 0) {
        missing = i;
      } else if (map[i] == 2) {
        dup = i;
      }
    }
    return new int[] { dup, missing };
  }

  public static void main(String[] args) {
    int[] nums = { 6, 5, 7, 1, 8, 6, 4, 3, 2 };
    System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));
    System.out.println(Arrays.toString(findMissingRepeatingNumbers2(nums)));
  }
}
