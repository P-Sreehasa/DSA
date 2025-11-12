class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[] = new int[2 * n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}


/*
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;    // Calculate the length of the array
        int ans[] = new int[2 * n];    // Create a new array to store the result
        for(int i = 0; i < n; i++){    // For each index of the nums array:
            ans[i] = nums[i];    // Store the values of the nums array in the 1st half 
            ans[i + n] = nums[i];    // Store the nums array values again in the 2nd half
        }
        return ans;    // Return the resultant array as the concatenation of the 1st array twice
    }
}
*/