class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n * 2];
        for(int i = 0; i < n; i++){
            arr[i * 2] = nums[i];
            arr[i * 2 + 1] = nums[n + i];
        }
        return arr;
    }
}


/*
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[n * 2];    // Create an array of 2n elements
        for(int i = 0; i < n; i++){    // For each index of the array:
            arr[i * 2] = nums[i];    // Store the xi-values at even indices
            arr[i * 2 + 1] = nums[n + i];    // Store the yi-values at odd indices
        }
        return arr;    // Return the final array of the form: [x1,y1,x2,y2,...,xn,yn]
    }
}
*/