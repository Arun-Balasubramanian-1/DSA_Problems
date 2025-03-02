package arrays.fundamentals;

public class SecondLargest {

  public static int secondLargestElement(int[] nums) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int element : nums){
      if(element > largest){  
        secondLargest = largest;
        largest = element;
      }
      else if(element > secondLargest && element < largest){
        secondLargest = element;
      }
    }
    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
  }

  public static void main(String[] args) {
    int[] nums = {71,86,89,45,6,8,31,85};
    System.out.println(secondLargestElement(nums));
  }
}


// 1) Linear search
// 2) Find Largest element
// 3) Find Second Largest Element