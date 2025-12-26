class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            minimum = Math.min(minimum, nums[i]);
            maximum = Math.max(maximum, nums[i]);
        }
        int score = Math.max(0, maximum - minimum - 2 * k);
        return score;
    }
}


/*
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;    // Calculate the size of the array
        int minimum = Integer.MAX_VALUE;    // Assign the maximum value to the minimum variable
        int maximum = Integer.MIN_VALUE;    // Assign the minimum value to the maximum variable
        for(int i = 0; i < n; i++){    // For each index of the array:
            minimum = Math.min(minimum, nums[i]);    // Calculate the minimum value 
            maximum = Math.max(maximum, nums[i]);    // Calculate the maximum value 
        }
        int score = Math.max(0, maximum - minimum - 2 * k);    // The score is calculated by subtracting twice k from the difference between maximum and minimum

        return score;    // Return the final score
    }
}
*/