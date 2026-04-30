class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }
    int dfs(int nums[], int i, int c){
        if(i == nums.length){
            return c;
        }
        int in = dfs(nums, i + 1, c ^ nums[i]);
        int ex = dfs(nums, i + 1, c);
        return in + ex;
    }
}