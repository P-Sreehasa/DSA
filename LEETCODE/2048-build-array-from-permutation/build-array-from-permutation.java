class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}


/*
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;    // Calculate the array size
        int ans[] = new int[n];    // Create a new array
        for(int i = 0; i < n; i++){    // For each index of the original array:
            ans[i] = nums[nums[i]];    // Store the  value at nums[i] in the new array
        }
        return ans;    // Return the nw array
    }
}
*/