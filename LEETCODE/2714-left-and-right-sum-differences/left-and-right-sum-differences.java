class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int l[] = new int[n];
        int r[] = new int[n];
        for(int i = 1; i < n; i++){
            l[i] = l[i - 1] + nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--){
            r[i] = r[i + 1] + nums[i + 1];
        } 
        for(int i = 0; i < n; i++){
            res[i] = Math.abs(l[i] - r[i]);
        }
        return res;
    }
}


/*
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;    // Calculate the length of the array
        int res[] = new int[n];    // New array to store the result
        int l[] = new int[n];    // Array to store the leftSum
        int r[] = new int[n];    // Array to store the rightSum
        for(int i = 1; i < n; i++){    // For each index of the array:
            l[i] = l[i - 1] + nums[i - 1];    // Store the sum of all elements to the left of i, starting from 1
        }
        for(int i = n - 2; i >= 0; i--){    // For each index of the array:
            r[i] = r[i + 1] + nums[i + 1];    // Store the sum of all elements to the right of i, starting at the last but one-th index
        } 
        for(int i = 0; i < n; i++){    // For each index of the array:
            res[i] = Math.abs(l[i] - r[i]);    // Get the difference between the left and right sums
        }
        return res;    // Return the final result
    }
}
*/