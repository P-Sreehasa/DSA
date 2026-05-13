class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums){
            int d = 0;
            int t = n;
            while(t != 0){
                t /= 10;
                d++;
            }
            if(d % 2 == 0){
                c++;
            }
        }
        return c;
    }
}

