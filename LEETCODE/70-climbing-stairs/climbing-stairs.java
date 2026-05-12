class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int o = 1;
        int t = 2;
        for(int i = 3; i <= n; i++) {
            int c = o + t;
            o = t;
            t = c;
        }
        return t;
    }
}