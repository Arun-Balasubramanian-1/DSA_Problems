package arrays.fundamentals;

import java.util.Arrays;

public class LeftRotateByK {

  public static void rotateArray(int[] nums, int k) {
    k = k % nums.length;

    int[] temp = new int[k];

    // Copy k elements of original array to temp Array
    for (int i = 0; i < k; i++) {
      temp[i] = nums[i];
    }

    // Move remaining elements in original array to left
    for (int i = k; i < nums.length; i++) {
      nums[i - k] = nums[i];
    }

    // Append the temp array elements to original array
    for (int i = 0; i < k; i++) {
      nums[nums.length - k + i] = temp[i];
    }

  }

  public static void rotateArrayWithoutAdditionalSpace(int[] nums, int k){
    reverseArray(nums, 0, k-1);
    reverseArray(nums, k, nums.length-1);
    reverseArray(nums, 0, nums.length-1);
  }

  public static void reverseArray(int[] nums, int start, int end){
    while(start < end){
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    int k = 2;
    rotateArray(nums, k);
    System.out.println(Arrays.toString(nums));
    int[] nums_2 = { 1, 2, 3, 4, 5, 6};
    rotateArrayWithoutAdditionalSpace(nums_2, k);
    System.out.println(Arrays.toString(nums_2));

  }

}
