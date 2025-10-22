class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len * 2];
        for(int i = 0; i < len; i++){
            arr[i] += nums[i];
            arr[i + len] += nums[i];
        }
        return arr;
    }
}


/*
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;    // Calculate the length of the original array
        int arr[] = new int[len * 2];    // Array to store the concatenated elements
        for(int i = 0; i < len; i++){    // For each value in the original array:
            arr[i] = nums[i];    // Assign it to the new array (makes up the 1st half, upto len - 1)
            arr[i + len] = nums[i];    // For the other half, assign the original array's elements to the new array
        }
        return arr;    // Return the final result
    }
}
*/