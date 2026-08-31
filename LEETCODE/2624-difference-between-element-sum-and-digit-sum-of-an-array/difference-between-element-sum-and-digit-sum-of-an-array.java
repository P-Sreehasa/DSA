class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            element_sum += current;
            while(current > 0){
                int rem = current % 10;
                digit_sum += rem;
                current /= 10;
            }
        }
        return (element_sum - digit_sum);
    }
}


/*
class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;    // Variable to calculate the elementSum
        int digit_sum = 0;    // Variable to calculate the digitSum
        for(int i = 0; i < nums.length; i++){    // For each value of the array:
            int current = nums[i];    // Store the value at current the index in the current variable
            element_sum += current;    // Add the current variable's value to the elementSum
            while(current > 0){    // As long as the current variable's value is greater than 0:
                int rem = current % 10;    // Get the last digit of the current variable
                digit_sum += rem;    // Add the last digit to the digitSum
                current /= 10;    // Move to the next digit
            }
        }
        return (element_sum - digit_sum);    // Return the difference of elementSum and digitSum as the final result
    }
}
*/