package arrays.faqhard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {

  // array iteration
  public static int majorityElement1(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
      if (count > nums.length / 2) {
        return nums[i];
      }
    }
    return -1;
  }

  // with hashmap
  public static int majorityElement2(int[] nums) {

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int element : nums) {
      map.put(element, map.getOrDefault(element, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }
    return -1;
  }

  // optimal
  public static int majorityElement3(int[] nums) {

    int count = 0;
    int element = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        element = nums[i];
        count = 1;
      } else if (nums[i] == element) {
        count++;
      } else {
        count--;
      }
    }

    count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == element) {
        count++;
      }
    }
    if (count > nums.length / 2) {
      return element;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
    System.out.println("Majority element: " + majorityElement1(nums));
    System.out.println("Majority element: " + majorityElement2(nums));
    System.out.println("Majority element: " + majorityElement3(nums));

  }

}
