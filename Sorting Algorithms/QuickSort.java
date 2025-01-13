import java.util.Arrays;

public class QuickSort {
  
  public static int partitionAndFindPivotIndex(int[] arr, int low, int high){
    int i = low;
    int j = high;
    int pivot = arr[low];

    // Iterate such that elements on one side is less than pivot and elements on other side is greater than pivot
    while(i < j){

      while((arr[i] <= pivot) && (i < high)){
        i++;
      }

      while((arr[j] > pivot) && (j > low)){
        j--;
      }

      if(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // swap pivot with j position
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    // Pivot element is placed in correct position after each call to this method

    return j;
  }

  public static void quickSort(int[] arr, int low, int high){
    if(low < high){
      // System.out.println("Low: " + low + " High: " + high);
      int pivotIndex = partitionAndFindPivotIndex(arr, low, high);
      quickSort(arr, low, pivotIndex - 1);
      quickSort(arr, pivotIndex + 1, high);
    }
  }

  public static void main(String[] args){
    int[] arr = {7, 4, 1, -2, 1000, 5, 3, 10, 1, -10, 100, 5};
    System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
