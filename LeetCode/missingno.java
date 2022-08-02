
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 
public class missingno {
    public static int missingNumber(int[] nums) {
        // int sum = (int)( (1+nums.length)* (nums.length/2.));
        // for (var num:nums) sum-=num;
        // return sum;
        int sum =0;
        for (int i = 0; i <= nums.length; i++) {
            sum = sum + i;//sum the numbers till length
        }
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];//remaing will be the missing no.

        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,0};
        int n = missingNumber(nums);
        System.out.println(n);
    }
}