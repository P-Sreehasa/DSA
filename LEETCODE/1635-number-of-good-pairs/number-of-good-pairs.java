class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}


/*
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;    // Variable to store the count of the no.of good pairs
        int n = nums.length;    // Calculate the length of the array
        for(int i = 0; i < n; i++){    // For each index of the array:
            for(int j = i + 1; j < n; j++){    // For each index of j greater than i:
                if(nums[i] == nums[j]){    If the values at i and j are equal:
                    count++;    // Increment the counter variable
                }
            }
        }
        return count;    // Return the final count of the no.of good pairs
    }
}
*/