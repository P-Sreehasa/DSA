class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                c++;
            } else{
                max = Math.max(max, c);
                c = 0;
            }
        }
        return Math.max(max, c);
    }
}


/*
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;    // Variable to store the count of 1s
        int max = 0;    // Variable to store the count of maximum number of consecutive 1s
        for(int i = 0; i < nums.length; i++){    // For each value in the array:
            if(nums[i] == 1){    // If the current value is 1:
                c++;    // Increment the counter variable
            } else{    // If the current value is NOT 1:
                max = Math.max(max, c);    // Store the maximum no.of 1s count in the max variable
                c = 0;    // Set the counter variable to 0
            }
        }
        return Math.max(max, c);    // Return the max no.of 1s
    }
}
*/