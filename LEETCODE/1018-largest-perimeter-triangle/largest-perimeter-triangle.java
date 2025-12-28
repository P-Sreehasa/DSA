class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n - 1; i >= 2; i--){
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if(c + b > a){
                return a + b + c;
            }
        }
        return 0;
    }
}


/*
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);    // Sort the array
        int n = nums.length;    // Calculate the array size
        for(int i = n - 1; i >= 2; i--){    // For each index of the array from the largest element:
            int a = nums[i];    // Store the largest element in a
            int b = nums[i - 1];    // Store the second largest element in b
            int c = nums[i - 2];    // Store the third largest element in c
            if(c + b > a){    // If the sum of 2 sides is greater then the 3rd side:
                return a + b + c;    // Return the sum
            }
        }
        return 0;    // If the sum of 2 sides is not greater then the 3rd side, return 0
    }
}
*/