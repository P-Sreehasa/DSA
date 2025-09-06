class Solution {
    public int smallestIndex(int[] nums) {
        int num = nums.length;
        for(int i = 0; i < num; i++){
            int n = nums[i];
            int s = 0;
            while(n > 0){
                s += n % 10;
                n /= 10;
            }
            if(s == i){
                return i;
            }
        }
        return -1;
    }
}


/*
class Solution {
    public int smallestIndex(int[] nums) {
        int num = nums.length;    // Variable to store the size of the array
        for(int i = 0; i < num; i++){    // For each value in the array:
            int n = nums[i];    // Variable to store the value at current index
            int s = 0;    // Variable to track sum
            while(n > 0){    // As long as the number is greater than 0:
                s += n % 10;    // Get the last digit and add it to the sum
                n /= 10;    // Remove the last digit
            }
            if(s == i){    // If the sum is equal to the current index:
                return i;    // Return that index
            }
        }
        return -1;    // Ifnot, return -1
    }
}
*/