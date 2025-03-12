import java.util.Arrays;

public class RemoveDuplicatesFromSorted {

  public static void removeDuplicates(int[] nums) {
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[j++] = nums[i];
      }
    }
    while(j < nums.length){
      nums[j++] = -1;
    }
  }

  public static void main(String[] args) {
    int[] nums = { -30, -30, 0, 0, 10, 20, 30, 30 };
    removeDuplicates(nums);
    System.out.println(Arrays.toString(nums));
  }

}
