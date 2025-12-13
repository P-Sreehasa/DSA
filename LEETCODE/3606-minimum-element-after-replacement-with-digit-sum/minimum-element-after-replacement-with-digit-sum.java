class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int d = nums[i];
            int sum = 0;
            while(d > 0){
                sum += d % 10;
                d /= 10;
            } 
            nums[i] = sum;
        }
        int m = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            m = Math.min(nums[i], m);
        }
        return m;
    }
}