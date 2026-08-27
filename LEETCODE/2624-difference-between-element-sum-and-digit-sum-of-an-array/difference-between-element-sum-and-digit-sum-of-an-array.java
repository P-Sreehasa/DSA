class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            element_sum += current;
            while(current > 0){
                int rem = current % 10;
                digit_sum += rem;
                current /= 10;
            }
        }
        return (element_sum - digit_sum);
    }
}