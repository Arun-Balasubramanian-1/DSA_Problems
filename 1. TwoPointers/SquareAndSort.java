public class SquareAndSort {
  
  public static int[] getSquareDAndSortedArray(int[] arr){
    int[] result = new int[arr.length];
    
    int k=arr.length-1;
    int i=0, j=arr.length-1;

    while(i<j){
      int lsquare = arr[i] * arr[i];
      int rsquare = arr[j] * arr[j];

      if(lsquare>=rsquare){
        result[k--] = lsquare;
        i++;
      }else{
        result[k--] = rsquare;
        j--;
      }
    }

    return result;
  }
  public static void main(String[] args) {
    
    int[] arr = {-3, -1, 0, 1, 2};
    arr = getSquareDAndSortedArray(arr);
    for(int element: arr){
      System.out.println(element);
    }
  }
}
