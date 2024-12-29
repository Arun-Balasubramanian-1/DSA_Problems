public class MaxSumSubArray {

  public static int findMaxSum(int[] arr, int k) {
      int start = 0;
      int maxSum = Integer.MIN_VALUE;
      int sum = 0;

      for (int end = 0; end < arr.length; end++) {
          sum += arr[end];

          if (end >= k - 1) {
              maxSum = Math.max(sum, maxSum);
              sum -= arr[start];
              start++;
          }
      }

      return maxSum;
  }

  public static void main(String[] args) {
      int[] arr = {2, 3, 4, 1, 5};
      int k = 2;
      int result = findMaxSum(arr, k);
      System.out.println("Max Sum sub array of size K: " + result);
  }
}