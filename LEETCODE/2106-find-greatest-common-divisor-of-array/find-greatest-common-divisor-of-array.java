class Solution {
    public int findGCD(int[] nums) {
        int minn = nums[0];
        int maxx = nums[0];
        for(int n : nums){
            if(n > maxx){
                maxx = n;
            }
            if(n < minn){
                minn = n;
            }
        }
        while(maxx != 0){
                int t = maxx;
                maxx = minn % maxx;
                minn = t;
        }
        return minn;
    }
}


/*
class Solution {
    public int findGCD(int[] nums) {
        int minn = nums[0];    // Variable to store the first value of the array as minimum value
        int maxx = nums[0];    // Variable to store the first value of the array as maximum value
        for(int n : nums){    // For each value in the array:
            if(n > maxx){    // If the value at current index is greater than the maximum value:
                maxx = n;    // Update it with the maximum value
            }
            if(n < minn){    // If the value at current index is lesser than the minimum value:
                minn = n;    // Update it with the minimum value
            }
        }
        while(maxx != 0){    // As long as the maximum value is not 0:
                int t = maxx;    // Store the maximum value in a temporary variable
                maxx = minn % maxx;    // Get the remainder and store it in maximum variable
                minn = t;    // Update minimum variable with the value in the temporary variable
        }
        return minn;    // Return the minimum value 
    }
}
*/