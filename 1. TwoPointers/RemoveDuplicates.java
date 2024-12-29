public class RemoveDuplicates {
  
  public static int[] removeDuplicates(int[] arr){
    if (arr.length == 0) return arr;

    int j = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        arr[j++] = arr[i];
      }
    }

    System.out.println("Unique Elements: " + j);

    while (j < arr.length) {
      arr[j++] = -1;
    }

    return arr;
  }
  public static void main(String[] args) {
    int[] arr = {2, 3, 3, 3, 6, 9, 9};
    arr = removeDuplicates(arr);

    System.out.println("Array Length: "+arr.length);
    for(int element : arr){
      System.out.println(element);
    }
  }
}
