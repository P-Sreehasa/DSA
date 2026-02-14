class Solution {
    public int totalMoney(int n) {
        int t = 0;
        int w = n / 7;
        int d = n % 7;
        for(int i = 0; i < w; i++){
            int s = i + 1;
            t += 7 * s + 21;
        }
        int s = w + 1;
        for(int i = 0; i < d; i++){
            t += s + i;
        }
        return t;
    }
}

