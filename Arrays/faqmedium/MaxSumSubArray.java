package arrays.faqmedium;

import java.util.Arrays;

public class MaxSumSubArray {
  public static int maxSubArray(int[] nums) {
    int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = { -30,17,-32,-13,-38,-33,-45,38,18,8,12,26,17,43,-15,-8,-18,17,47,-26,3,44,23,6,-34,-14,20,-41,-17,46,-45,32,23,-44,38,-36,-16,43,14,13,9,44,6,23,-29,21,-23,18,7,-15,11,-49,38,34,-39,28,15,-33,41,27,40,32,-20,31,24,30,26,19,35,-9,-39,-40,-6,-11,22,-42,48,-23,-32,-48,33,32,10 };
    System.out.println(Arrays.toString(nums));
    System.out.println(maxSubArray(nums));
  }
}
