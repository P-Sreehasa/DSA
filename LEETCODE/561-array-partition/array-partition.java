class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
}


/*
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);    // Sort the array
        int sum = 0;    // Variable to calculate the sum of array elements
        for(int i = 0; i < nums.length; i += 2){    // For every 2nd element of the array:
            sum += nums[i];    // Add it to the sum
        }
        return sum;    // Return the sum of the array elements
    }
}
*/