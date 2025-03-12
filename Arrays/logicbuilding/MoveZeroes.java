import java.util.Arrays;

class MoveZeroes {

  public static void moveZeroes(int[] nums) {

    int i = 0, j = 0;
    int n = nums.length;

    while (i < n) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
      i++;
    }

    while (j < n) {
      nums[j] = 0;
      j++;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 4, 0, 5, 2 };
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }

}