public class BinarySearch {

  public static int search(int[] arr, int element, int low, int high){

    if(low > high)
      return -1;

    int mid = low + (high - low) / 2;

    if(arr[mid] == element){
      return mid;
    }else if(arr[mid] > element){
      return search(arr, element, low, mid -1);
    }else{
      return search(arr, element, mid + 1, high);
    }
  }

  public static void main(String[] args){
    int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    int element = 56;
    System.out.println("Element: " + element + " at index " + search(arr, element, 0, arr.length - 1)); 
  }
}
