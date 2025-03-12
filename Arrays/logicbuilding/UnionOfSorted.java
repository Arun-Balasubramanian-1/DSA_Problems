package arrays.logicbuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfSorted {
  public static int[] unionArray(int[] nums1, int[] nums2) {
    List<Integer> list = new ArrayList<Integer>();
    int i = 0, j = 0;

    while (i < nums1.length && j < nums2.length) {
      int n = list.size();
      int lastElement = (n > 0) ? list.get(n - 1) : -1;
      if (lastElement == nums1[i]) {
        i++;
      } else if (lastElement == nums2[j]) {
        j++;
      } else if (nums1[i] < nums2[j]) {
        list.add(nums1[i]);
        i++;
      } else if (nums2[j] < nums1[i]) {
        list.add(nums2[j]);
        j++;
      } else {
        list.add(nums1[i]);
        i++;
        j++;
      }
    }
    while (i < nums1.length) {
      int lastElement = list.get(list.size() - 1);
      if (lastElement == nums1[i]) {
        i++;
      } else {
        list.add(nums1[i]);
        i++;
      }
    }

    while (j < nums2.length) {
      int lastElement = list.get(list.size() - 1);
      if (lastElement == nums2[j]) {
        j++;
      } else {
        list.add(nums2[j]);
        j++;
      }
    }

    int[] result = new int[list.size()];
    for (i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }
    return result;
  }

  public static void main(String[] var0) {
    int[] var1 = new int[] { 0, 1, 2, 4, 5, 6 };

    int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] nums2 = { 2, 3, 4, 4, 5, 11, 12 };

    System.out.println(Arrays.toString(unionArray(nums1, nums2)));
  }
}
