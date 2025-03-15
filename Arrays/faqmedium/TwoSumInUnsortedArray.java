package arrays.faqmedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumInUnsortedArray {
  public static int[] bruteTwoSum(int[] nums, int target) {
    int[] result = { -1, -1 };

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if ((nums[i] + nums[j]) == target) {
          return new int[] { i, j };
        }
      }
    }

    return result;
  }

  public static int[] betterTwoSum(int[] nums, int target) {
    int[] result = { -1, -1 };
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        int j = map.get(complement);
        return new int[] { i, j };
      }

      map.put(nums[i], i);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { -6, 7, 1, -7, 6, 2 };
    int target = 3;
    System.out.println(Arrays.toString(bruteTwoSum(nums, target)));
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(betterTwoSum(nums, target)));

  }
}
