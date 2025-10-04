class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = nums[n - 1] - nums[0];
        if(a <= 2 * k){
            return 0;
        }
        int minn = nums[0] + k;
        int maxx = nums[n - 1] - k;
        return maxx - minn;
    }
}


/*
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);    // Sort the array to find the minimum and maximum elements
        int n = nums.length;    // Calculate th length of the array
        int a = nums[n - 1] - nums[0];    // Store the difference between the largest value and the smallest value in the variable "a"
        if(a <= 2 * k){    // If the difference is is less than or equal to 2 * k: 
            return 0;    // Make the difference 0
        }
        int minn = nums[0] + k;    // Update the minimum by adding k to the smallest value
        int maxx = nums[n - 1] - k;    // Update the maximum by subtracting k from the largest value
        return maxx - minn;    // Return the final difference between the maximum and minimum values
    }
}
*/