class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}


/*
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c = 0;    // To maintain count of the pairs
        int n = nums.length;    // Length of the array elements
        for(int i = 0; i < n; i++){    // Loops from first element to the last
            for(int j = i + 1; j < n; j++){    // Because of the condition: i < j
                if(nums[i] == nums[j]){    // To check if elements at 2 indices are same
                    c++;    // If yes, increment the value of the variable
                }
            }
        }
        return c;    // Return the no.of times they're equal
    }
}
*/