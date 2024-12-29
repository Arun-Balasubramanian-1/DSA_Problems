public class PairSum {

  public static int[] findPairSum(int[] arr, int targetSum) {
    int left = 0, right = arr.length - 1;

    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == targetSum) {
        return new int[] { left, right };
      } else if (sum > targetSum) {
        right--;
      } else {
        left++;
      }
    }

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 6 };
    int targetSum = 6;

    int[] result = findPairSum(arr, targetSum);
    System.out.println(result[0] + ", " + result[1]);
  }
}