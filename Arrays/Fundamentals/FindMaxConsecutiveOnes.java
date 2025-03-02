package arrays.fundamentals;

public class FindMaxConsecutiveOnes {

  public static int findMaxConsecutiveOnes(int[] nums) {

    int max = -1;
    int count = 0;

    for (int element : nums) {
      count = (element == 1) ? (count + 1) : 0;
      max = Math.max(count, max);
    }
    return max;
  }

  public static void main(String args[]){
    int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
    System.out.println(findMaxConsecutiveOnes(nums));
  }
}
