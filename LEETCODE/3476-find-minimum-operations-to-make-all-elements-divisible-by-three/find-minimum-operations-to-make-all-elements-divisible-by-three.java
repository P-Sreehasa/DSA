class Solution {
    public int minimumOperations(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] + 1) % 3 == 0 || (nums[i] - 1) % 3 == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int minimumOperations(int[] nums) {
        int c = 0;    // To maintain count of the no.of values that satisfy the given condition
        for(int i = 0; i < nums.length; i++){    // Looping through each element in the array, from 0th index to the last index
            if((nums[i] + 1) % 3 == 0 || (nums[i] - 1) % 3 == 0){    // Checks if the element at that index, when added or subtracted by 1, is divisible by 3
                c++;    // If yes, increment the count of the variable
            }
        }
        return c;    // Return the final count
    }
}

*/