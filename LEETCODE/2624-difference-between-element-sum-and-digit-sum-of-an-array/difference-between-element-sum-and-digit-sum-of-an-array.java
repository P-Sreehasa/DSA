class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            element_sum += nums[i];
            int current = nums[i];
            while(current > 0){
                int num = current % 10;
                digit_sum += num;
                current /= 10;
            }
        }
        if(element_sum > digit_sum){
            return element_sum - digit_sum; 
        }
        return digit_sum - element_sum;
    }
}