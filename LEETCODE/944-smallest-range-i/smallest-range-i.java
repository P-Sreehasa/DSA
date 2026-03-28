class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n = nums.length;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            minimum = Math.min(minimum, nums[i]);
            maximum = Math.max(maximum, nums[i]);
        }
        int score = Math.max(0, maximum - minimum - 2 * k);
        return score;
    }
}

