package arrays.faqmedium;

import java.util.Arrays;
import java.util.Comparator;
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

  public static int[] alternateTwoSum(int[] nums, int target) {
    int[][] numsPosition = new int[nums.length][2];

    // Create 2-D Array with array element and positions
    for (int i = 0; i < nums.length; i++) {
      numsPosition[i][0] = nums[i];
      numsPosition[i][1] = i;
    }

    // Sort the 2-D Array based on the element
    Arrays.sort(numsPosition, new Comparator<int[]>() {
      public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
      }
    });

    int i = 0;
    int j = nums.length - 1;

    while (i < j) {
      int sum = numsPosition[i][0] + numsPosition[j][0];
      if (sum == target) {
        return new int[] { numsPosition[i][1], numsPosition[j][1] };
      } else if (sum < 0) {
        i++;
      } else {
        j--;
      }
    }
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] nums = { -6, 7, 1, -7, 6, 2 };
    int target = 3;
    System.out.println(Arrays.toString(bruteTwoSum(nums, target)));
    System.out.println(Arrays.toString(betterTwoSum(nums, target)));
    System.out.println(Arrays.toString(alternateTwoSum(nums, target)));

  }
}
