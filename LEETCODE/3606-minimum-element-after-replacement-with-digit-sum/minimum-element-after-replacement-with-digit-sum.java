class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            int d = nums[i];
            while(d > 0){
                sum += d % 10;
                d /= 10;
            }
            nums[i] = sum;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            min = Math.min(nums[i], min);
        }
        return min;
    }
}


/*
class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            int sum = 0;    // Variable to store the sum
            int d = nums[i];    // Store the current element in the variable
            while(d > 0){    // As long as the number is greater than 0:
                sum += d % 10;    // Extract the last digit and add it to the sum
                d /= 10;    // Move to the next digit
            }
            nums[i] = sum;    // Store the sum of the digits as the current element 
        }
        int min = Integer.MAX_VALUE;    // Variable for tracking the minimum value
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            min = Math.min(nums[i], min);    // Get the minimum between the current element and the minimum initialized
        }
        return min;    // Return the final minimum value of the array
    }
}
*/