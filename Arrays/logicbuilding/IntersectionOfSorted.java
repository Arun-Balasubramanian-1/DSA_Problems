package arrays.logicbuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSorted {

  public static int[] intersectionArray(int[] nums1, int[] nums2) {
    int i = 0;
    int j = 0;
    List<Integer> list = new ArrayList<Integer>();

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] == nums2[j]) {
        list.add(nums1[i]);
        i++;
        j++;

      } else if (nums1[i] < nums2[j]) {
        i++;
      } else {
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

    int[] nums1 = { -45, -45, 0, 0, 2 };
    int[] nums2 = { -50, -45, 0, 0, 5, 7 };

    System.out.println(Arrays.toString(intersectionArray(nums1, nums2)));
  }
}
