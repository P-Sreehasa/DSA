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

