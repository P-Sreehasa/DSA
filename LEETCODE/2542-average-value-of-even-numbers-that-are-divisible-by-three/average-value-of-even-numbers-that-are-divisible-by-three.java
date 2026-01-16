class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                int mul = nums[i];
                if(mul % 2 == 0){
                    sum += mul;
                    count++;
                }
            }
        }
        if(sum > 0 && count > 0){
            avg = sum / count;
            return avg;
        }
        return 0;
    }
}