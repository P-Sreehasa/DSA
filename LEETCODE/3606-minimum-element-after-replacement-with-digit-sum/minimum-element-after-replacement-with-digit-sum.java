class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;    
        for(int i = 0; i < n; i++){
            int s = 0;
            int t = nums[i];
            while(t > 0){
                s += t % 10;
                t /= 10;
            }
            nums[i] = s;
        }
        int m = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < m){
                m = nums[i];
            }
        }
        return m;
    }
}


/*
class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;    // Calculate the length of array
        for(int i = 0; i < n; i++){    // For each element in the array:
            int s = 0;    // Variable for maintaining track of sum
            int t = nums[i];    // Variable for maintaining track of every element in the array
            while(t > 0){    // As long as the variable is greater than 0:
                s += t % 10;    // Add the last digit to sum
                t /= 10;    // Remove the last digit
            }
            nums[i] = s;    // Store the sum into the array
        }
        int m = nums[0];    // Store the first value of array into a variable
        for(int i = 1; i < n; i++){    // For every value in the array:
            if(nums[i] < m){    // If the element as the index is less than the minimum value:
                m = nums[i];    // Replace the minimum value with that element
            }
        }
        return m;    // Return the minimum element
    }
}
*/