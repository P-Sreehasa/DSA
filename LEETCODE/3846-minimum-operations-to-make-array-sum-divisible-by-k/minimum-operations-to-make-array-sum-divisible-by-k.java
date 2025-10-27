class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            s += nums[i]; 
        }
        int rem = s % k;
        if(rem == 0){
            return 0;
        }
        return rem;
    }
}


/*
class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;    // Variable to store the sum 
        for(int i = 0; i < nums.length; i++){    // For each value in the array: 
            s += nums[i];    //  Add it to the sum
        }
        int rem = s % k;    // Calculate the remainder 
        if(rem == 0){    // If the remainder is 0: 
            return 0;    // Return 0 
        }
        return rem;    // Else, return the remainder 
    }
}*/