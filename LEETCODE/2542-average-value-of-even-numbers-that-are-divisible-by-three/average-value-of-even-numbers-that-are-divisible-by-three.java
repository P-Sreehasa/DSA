class Solution {
    public int averageValue(int[] nums) {
        int s = 0;
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0){
                s += nums[i];
                c++;
            }
        }
        if(c > 0){
            return s / c;
        }
        return 0;
    }
}


/*
class Solution {
    public int averageValue(int[] nums) {
        int s = 0;    // Variable to track sum
        int c = 0;    // Variable to track count
        for(int i = 0; i < nums.length; i++){    // For each index in the array:
            if(nums[i] % 2 == 0 && nums[i] % 3 == 0){    // If it is divisible by both 2 nd 3:
                s += nums[i];    // Add it to the sum
                c++;    // Increment the counter
            }
        }
        if(c > 0){    // If the count is greater than 0:
            return s / c;    // Return the final value by dividing sum by count
        }
        return 0;    // Else, return 0
    }
}
*/