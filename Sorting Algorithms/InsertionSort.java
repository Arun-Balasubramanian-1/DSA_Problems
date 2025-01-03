import java.util.Arrays;

// After each iteration - the list will be sorted from left based on the number of iterations
// Element is inserted into the sorted list from left

public class InsertionSort {
  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int value = arr[i];
      int j = i - 1;

      // Shift larger elements one position to the right
      while (j >= 0 && arr[j] > value) {
        arr[j + 1] = arr[j];
        j--;
      }

      // Place the current value in its correct position
      arr[j + 1] = value;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 7, 4, 1, -2, 5, 3 };
    arr = insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
