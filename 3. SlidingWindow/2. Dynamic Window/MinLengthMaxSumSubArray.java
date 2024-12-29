public class MinLengthMaxSumSubArray {

    public static int findMinSumLength(int[] arr, int sum) {
        int start = 0;
        int min = Integer.MAX_VALUE;
        int windowSum = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];

            while (windowSum >= sum) {
                min = Math.min(min, end - start + 1);
                windowSum -= arr[start];
                start++;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 1, 6};
        int sum = 8;
        int result = findMinSumLength(arr, sum);

        System.out.println(result);
    }
}