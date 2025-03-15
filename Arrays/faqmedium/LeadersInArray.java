package arrays.faqmedium;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
  public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int leader = nums[nums.length - 1];
        list.add(leader);
       
        for(int i = nums.length -2; i>=0; i--){
            if(nums[i] > leader){
                list.add(nums[i]);
                leader = nums[i];
            }
        }

        Collections.reverse(list); 
        return list;
    }

    public static void main(String[] args) {
      int[] nums = {-3, 4, 5, 1, -4, -5};
      System.out.println(leaders(nums));
    }
}


// Given an integer array nums, return a list of all the leaders in the array.
// A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.
