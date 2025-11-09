class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n - 1];
        return Math.max(p1, p2);
    }
}


/*
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);    // Sort the array
        int n = nums.length;    // Calculate the length of the array
        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];    // Calculate the product of 3 elements from the end of the array
        int p2 = nums[0] * nums[1] * nums[n - 1];    // Calculate the product of 2 smallest elements and 1 largest element
        return Math.max(p1, p2);    // Return the final maximum product 
    }
}
*/