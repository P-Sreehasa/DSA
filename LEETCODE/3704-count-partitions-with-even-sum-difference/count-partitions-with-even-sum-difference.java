class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int left_part = 0;
        for(int i = 0; i < nums.length - 1; i++){
            int current = nums[i];
            left_part += current;
            int right_part = 0;
            for(int j = i + 1; j < nums.length; j++){
                right_part += nums[j];
            }
            int res = left_part - right_part;
            if(res % 2 == 0){
                count++;
            }
        }
        return count;
    }
}