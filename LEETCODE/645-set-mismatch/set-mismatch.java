class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
        }
        int d = -1, m = -1;
        for(int i = 1; i <= nums.length; i++){
            if(arr[i] == 2){
                d = i;
            }
            if(arr[i] == 0){
                m = i;
            }
        }
        return new int[]{d, m};
    }
}


/*
class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[] = new int[nums.length + 1];    // Create a new array of size 1 more than the nums array
        for(int i = 0; i < nums.length; i++){    // For each index of the array:
            arr[nums[i]]++;    // Count the no.of times each value appears in the array
        }
        int d = -1, m = -1;    // Variables to store the duplicate and missing values
        for(int i = 1; i <= nums.length; i++){    // For each index of the array:
            if(arr[i] == 2){    // If any value appears twice:
                d = i;    // Add it to duplicate
            }
            if(arr[i] == 0){    // If any element doesn't appear:
                m = i;    // Add it to missing
            }
        }
        return new int[]{d, m};    // Return the final duplicate, missing pair
    }
}
*/