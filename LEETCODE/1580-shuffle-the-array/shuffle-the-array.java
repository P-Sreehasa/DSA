class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int ind = 0;
        for(int i = 0; i < n; i++){
            int x = nums[i];
            int y = nums[i + n];
            arr[ind] = x;
            ind++;
            arr[ind] = y;
            ind++;
        }
        return arr;
    }
}


/*
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];    // Array to store the element in [x, y] order
        int ind = 0;    // Variable to track the array index
        for(int i = 0; i < n; i++){    // For each value from 0 to n - 1:
            int x = nums[i];    // Store the values from 0 to n - 1 in x
            int y = nums[i + n];    // Store the values from n to end of nums array length in y
            arr[ind] = x;    // Store the x value in the array
            ind++;    // Increment the index
            arr[ind] = y;    // Store the y value in the array
            ind++;    // Increment the index
        }
        return arr;    // Return the final array in the form of {x, y}
    }
}
*/