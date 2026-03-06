class Solution {
    public int maxProduct(int[] nums) {
        int maxx = nums[0];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int p = 1;
            for(int j = i; j < n; j++){
                p *= nums[j];
                maxx = Math.max(maxx, p);
            }
        }
        return maxx;
    }
}