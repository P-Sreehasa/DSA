class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        int remainder = sum % k;
        if(remainder == 0){
            return 0;
        } 
        return remainder;
    }
}


/*
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;    // Variable to store the sum of the elements
        for(int i = 0; i < nums.length; i++){    // For each value of the array:
            sum = sum + nums[i];    // Add it to the sum
        }
        int remainder = sum % k;    // Store the remainder of sum and k
        if(remainder == 0){    // If they are divisible:
            return 0;    // Return 0
        } 
        return remainder;    // If they are not divisible, return the remainder
    }
}
*/