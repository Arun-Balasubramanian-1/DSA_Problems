import java.util.Arrays;

// Swap the smallest value to the first element and repeat for each iteration

public class SelectionSort {
  public static int[] selectionSort(int[] arr){

    for(int i=0; i< arr.length; i++){

      int minIndex = i;

      for(int j=i+1; j<arr.length; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }

      if(minIndex != i){
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
    return arr;
  }

  public static void main(String[] args){
    int[] arr = {7, 4, 1, -2, 5, 3};
    arr = selectionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
