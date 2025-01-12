import java.util.Arrays;

public class MergeSort {
  
  public static void merge(int[] arr, int low, int mid, int high){
    System.out.println("Merge -> Low: " + low + " High: " + high);
    int left = low;
    int right = mid + 1;

    int[] temp = new int[high-low+1];
    int index = 0;

    while((left <= mid) && (right <= high)){
      if(arr[left] <= arr[right]){
        temp[index] = arr[left];
        left++;
      }else{
        temp[index] = arr[right];
        right++;
      }
      index++;
    }

    while(left <= mid){
      temp[index] = arr[left];
      left++;
      index++;
    }

    while(right <= high){
      temp[index] = arr[right];
      right++;
      index++;
    }
    
    for(int i=low; i<=high; i++){
      arr[i] = temp[i-low];
    }
    // System.out.println(Arrays.toString(arr));
  }

  public static void mergeSort(int[] arr, int low, int high){
    // System.out.println("Low: " + low + " High: " + high);
    if(low == high)
      return;

    // System.out.println("        Low: " + low + " High: " + high);
    int mid = (low + high)/2;
    // System.out.println("Low: " + low + " Mid: " + mid + " High: " + high);
    mergeSort(arr, low, mid);
    // System.out.println("                    Low: " + low + " Mid: " + (mid+1) + " High: " + high);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void main(String[] args){
    int[] arr = {7, 4, 1, -2, 1000, 5, 3, 10, 1, -10, 100, 5};
    System.out.println(Arrays.toString(arr));
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
