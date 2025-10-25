class Solution {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            } else{
                nums[i] = 1;
            }
            Arrays.sort(nums);
        }
        return nums;        
    }
}


/*
class Solution {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){    // For each value in the array:
            if(nums[i] % 2 == 0){    // If the current value is even:
                nums[i] = 0;    // Replace the value with 0
            } else{    // If the current value is odd:
                nums[i] = 1;    // Replace the value with 1
            }
            Arrays.sort(nums);    // Sort the array (after replacement)
        }
        return nums;    // Return the final array with replaced and sorted values     
    }
}
*/