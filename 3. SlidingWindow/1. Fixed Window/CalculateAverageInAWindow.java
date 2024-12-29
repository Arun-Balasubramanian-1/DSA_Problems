public class CalculateAverageInAWindow {

  public static double[] calculateAverage(int[] arr, int k) {
      double[] result = new double[arr.length - k + 1];
      int start = 0;
      double sum = 0;

      for (int end = 0; end < arr.length; end++) {
          sum += arr[end];

          if (end >= k - 1) {
              result[start] = sum / k;
              sum -= arr[start];
              start++;
          }
      }

      return result;
  }

  public static void main(String[] args) {
      int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
      int k = 5;
      double[] result = calculateAverage(arr, k);

      System.out.println("Averages of subarrays of size K: ");
      for (double num : result) {
          System.out.println(num);
      }
  }
}