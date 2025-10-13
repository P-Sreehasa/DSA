class Solution {
    public int arraySign(int[] nums) {
        int s = 1;
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(n == 0){
                return 0;
            }
            if(n < 0){
                s *= -1;
            }
        }
        return s;
    }
}


/*
class Solution {
    public int arraySign(int[] nums) {
        int s = 1;    // Let the initial sign be +ve
        for(int i = 0; i < nums.length; i++){    // For each value in the array:
            int n = nums[i];
            if(n == 0){    // If any number is 0:
                return 0;    // Product is 0
            }
            if(n < 0){    // If the number is -ve:
                s *= -1;    // Make it positive
            }
        }
        return s;    // Return the final sign
    }
}
*/