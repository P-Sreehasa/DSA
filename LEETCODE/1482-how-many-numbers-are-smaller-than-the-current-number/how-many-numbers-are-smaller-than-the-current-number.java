class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            for(int j = 0; j < nums.length; j++){
                if(j != i && nums[j] < nums[i]){
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}


/*
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];    // Create a new array to store the result
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            int c = 0;    // Variable to maintain the count of smaller values
            for(int j = 0; j < nums.length; j++){    // Compare each i with j:
                if(j != i && nums[j] < nums[i]){    // If nums[j] is less than nums[i] and i and j are not same:
                    c++;    // Increment the counter variable
                }
            }
            res[i] = c;    // Store it in the result array
        }
        return res;    // Return the final array
    }
}
*/