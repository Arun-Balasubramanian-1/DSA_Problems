
public class MissingNumber {

  public static int missingNumber(int[] nums) {

    int n = nums.length;
    int sum = n * (n + 1) / 2;

    for (int i = 0; i < n; i++) {
      sum -= nums[i];
    }

    return sum;
  }

  public static void main(String[] var0) {
    int[] var1 = new int[] { 0, 1, 2, 4, 5, 6 };
    
    System.out.println(missingNumber(var1));
  }

}
