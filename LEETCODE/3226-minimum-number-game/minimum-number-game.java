class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int arr[] = new int[n];
        int t = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            int a = nums[i];
            int b = nums[i + 1];
            arr[t++] = b;
            arr[t++] = a;
        }
        return arr;
    }
}


/*
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);    // Sort the array
        int n = nums.length;    // Calculate the length of the array
        int arr[] = new int[n];    // New array to store the result
        int t = 0;    // Variable used for inserting values into the array
        for(int i = 0; i < n; i = i + 2){    // For each value-pair in the array:
            int a = nums[i];    // Alice takes the smallest
            int b = nums[i + 1];    // Bob takes the next smallest
            arr[t++] = b;    // Bob adds first
            arr[t++] = a;    // Alice adds next
        }
        return arr;    // Return the final array
    }
}
*/