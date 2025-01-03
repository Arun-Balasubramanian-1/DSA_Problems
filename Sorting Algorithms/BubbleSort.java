import java.util.Arrays;

// Swap the adjacent element and move the largest value to the last after each iteration

public class BubbleSort {
  public static int[] bubbleSort(int[] arr){

    for(int i=0; i< arr.length; i++){

      for(int j=1; j<arr.length-i; j++){
        
        if(arr[j-1] > arr[j]){
          int temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
      
    }
    return arr;
  }

  public static void main(String[] args){
    int[] arr = {7, 4, 1, -2, 5, 3};
    arr = bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
