// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
//import java.util.*;
// if(nums[i]==0){
            //     for (int j = i; j < nums.length-1; j++) {
            //         temp = nums[j+1];
            //         nums[j+1] = nums[j];
            //         nums[j]=temp;
            //     }
                
            // }
class MoveZeros {
    public static void moveZeros(int[] nums){
        int temp =0 ,counter =0;
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] != 0) {
                temp = nums[counter];
                nums[counter]=nums[i];
                nums[i]=temp;
                counter++;  
                
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeros(nums);
        //print
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
