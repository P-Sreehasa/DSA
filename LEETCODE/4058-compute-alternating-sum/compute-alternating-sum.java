class Solution {
    public int alternatingSum(int[] nums) {
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                s += nums[i];
            } else{
                s -= nums[i];
            }
        }
        return s;
    }
}


/*
class Solution {
    public int alternatingSum(int[] nums) {
        int s = 0;    // Variable to store sum
        for(int i = 0; i < nums.length; i++){    // For each index in the array:
            if(i % 2 == 0){    // If the current index is even:
                s += nums[i];    // Add it to the sum
            } else{    // If the current index is odd:
                s -= nums[i];    // Subtract it from the sum
            }
        }
        return s;    // Return the final sum
    }
}
*/