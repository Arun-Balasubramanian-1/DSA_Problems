package arrays.faqmedium;

import java.util.Arrays;

public class RearrangeArrayBySign {
  public static int[] rearrangeArray(int[] nums) {
    int[] result = new int[nums.length];

    int positiveIndex = 0;
    int negativeIndex = 1;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        result[negativeIndex] = nums[i];
        negativeIndex += 2;
      } else {
        result[positiveIndex] = nums[i];
        positiveIndex += 2;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, -1, -3, -4, 2, 3 };
    System.out.println(Arrays.toString(rearrangeArray(nums)));
  }
}

// Given an integer array nums of even length consisting of an equal number of
// positive and negative integers.Return the answer array in such a way that the
// given conditions are met:

// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in
// nums is preserved.
// The rearranged array begins with a positive integer.