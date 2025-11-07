class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int s = 0;
        for(int i = 0; i < n; i = i + 2){
            s += nums[i];
        }
        return s;
    }
}


/*
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;    // Calculate the length of the array
        Arrays.sort(nums);    // Sort the array such that sum of adjacent elements is maximum
        int s = 0;    // Variable to store the sum of the minimum elements in each pair
        for(int i = 0; i < n; i = i + 2){    // For each even index:
            s += nums[i];    // Add it to the sum
        }
        return s;    // Return the maximum possible sum of the elements
    }
}
*/