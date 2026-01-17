class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                int mul = nums[i];
                if(mul % 2 == 0){
                    sum += mul;
                    count++;
                }
            }
        }
        if(sum > 0 && count > 0){
            avg = sum / count;
            return avg;
        }
        return 0;
    }
}


/*
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;    // Variable to store the sum
        int count = 0;    // Variable to count of the even numbers divisible by 3
        int avg = 0;    // Variable to store the average of the even no's divisible by 3
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            if(nums[i] % 3 == 0){    // If the current value is a multiple of 3:
                int mul = nums[i];    // Store it in a new variable
                if(mul % 2 == 0){    // If the current value is even:
                    sum += mul;    // Add it to the sum
                    count++;    // Increment the counter variable
                }
            }
        }
        if(sum > 0 && count > 0){    // As long as the sum and count are not 0:
            avg = sum / count;    // Calculate the average of the numbers
            return avg;    // Return the average
        }
        return 0;    // If the sum is zero, return 0
    }
}
*/