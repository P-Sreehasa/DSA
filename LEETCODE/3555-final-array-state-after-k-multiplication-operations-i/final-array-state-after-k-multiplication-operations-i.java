class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++){
            int m = 0;
            int n = nums.length;
            for(int j = 0; j < n; j++){
                if(nums[j] < nums[m]){
                    m = j;
                }
            }
            nums[m] *= multiplier;
        }
        return nums;
    }
}


/*
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i = 0; i < k; i++){    // Outer loop for performing the operation over the array elements for "k" times
            int m = 0;    // Variable for tracking the minimum value, stores current minimum element's index
            int n = nums.length;   // To calculate array length
            for(int j = 0; j < n; j++){    // Inner loop to find the minimum element's index
                if(nums[j] < nums[m]){    // If the current value is less than the minimum value
                    m = j;    // Assign the current value's index to the variable "m" as the new minimum
                }
            }
            nums[m] *= multiplier;    // Multiply as follows: Replace the selected minimum value x with x * multiplier
        }
        return nums;    // Return the final array
    }
}
*/