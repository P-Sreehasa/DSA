class Solution {
    public int countPartitions(int[] nums) {
        //int n = nums.length;
        int s = 0;
        for(int n : nums){
            s += n;
        }
        int c = 0;
        int l = 0;
        for(int i = 0; i < nums.length - 1; i++){
            l += nums[i];
            int r = s - l;
            int d = l - r;
            if(d % 2 == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int countPartitions(int[] nums) {
        int s = 0;    // Variable to track sum
        for(int n : nums){    // For each value in the array:
            s += n;    // Add it to the sum
        }
        int c = 0;    // Variable to track valid partitions 
        int l = 0;    // Variable to track the left partition's sum
        for(int i = 0; i < nums.length - 1; i++){    // For each value in the partition:
            l += nums[i];    // Add the current index t the left partition
            int r = s - l;    // Variable to track the right partition's sum by subtracting sum from left partition's sum
            int d = l - r;    // Calculate the difference between the left and right partitions
            if(d % 2 == 0){    // If the difference is even:
                c++;    // Increment the counter variable
            }
        }
        return c;    // Return the final count
    }
}
*/