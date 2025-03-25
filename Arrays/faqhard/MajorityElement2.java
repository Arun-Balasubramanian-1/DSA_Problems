package arrays.faqhard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

  // array iteration
  public static List<Integer> majorityElementTwo1(int[] nums) {
    List<Integer> list = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {

      int count = 0;
      if (list.size() > 0 && (nums[i] == list.get(0))) {
        continue;
      }

      for (int j = 0; j < n; j++) {
        if (nums[j] == nums[i]) {
          count++;
        }
        if (count > n / 3) {
          list.add(nums[i]);
          break;
        }
      }

      if (list.size() == 2) {
        break;
      }
    }
    return list;
  }

  // hashmap frequency
  public static List<Integer> majorityElementTwo2(int[] nums) {
    List<Integer> list = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    int n = nums.length;

    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      int listSize = list.size();
      if ((map.get(nums[i]) > n / 3) && ((listSize == 0) || listSize > 0 && (list.get(0) != nums[i]))) {

        list.add(nums[i]);
      }
      if (list.size() == 2) {
        break;
      }
    }

    return list;
  }

  // optimal approach
  public static List<Integer> majorityElementTwo3(int[] nums) {
    List<Integer> list = new ArrayList<>();

    int n = nums.length;
    int ele1 = Integer.MIN_VALUE;
    int ele2 = Integer.MIN_VALUE;

    int count1 = 0;
    int count2 = 0;

    for (int i = 0; i < n; i++) {
      if (count1 == 0 && nums[i] != ele2) {
        ele1 = nums[i];
        count1 = 1;
      } else if (count2 == 0 && nums[i] != ele1) {
        ele2 = nums[i];
        count2 = 1;
      } else if (nums[i] == ele1) {
        count1++;
      } else if (nums[i] == ele2) {
        count2++;
      } else {
        count1--;
        count2--;
      }
    }

    count1 = 0;
    count2 = 0;

    for (int i = 0; i < n; i++) {
      if (nums[i] == ele1) {
        count1++;
      }
      if (nums[i] == ele2) {
        count2++;
      }
    }

    if (count1 > n / 3) {
      list.add(ele1);
    }
    if (count2 > n / 3) {
      list.add(ele2);
    }

    return list;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1, 1, 3, 2, 2, 3 };
    System.out.println("Majority elements: " + majorityElementTwo1(nums));
    System.out.println("Majority elements: " + majorityElementTwo2(nums));
    System.out.println("Majority elements: " + majorityElementTwo3(nums));

  }
}

// Given an integer array nums of size n. Return all elements which appear more
// than n/3 times in the array.
// The output can be returned in any order.