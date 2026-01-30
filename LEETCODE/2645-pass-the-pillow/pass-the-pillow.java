class Solution {
    public int passThePillow(int n, int time) {
        int num = 2 * (n - 1);
        int t = time % num;
        if(t <= n - 1){
            return t + 1;
        } else{
            return 2 * n - t - 1;
        }
    }
}