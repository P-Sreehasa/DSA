class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int a = 1; a <= n; a++){
            for(int b = 1; b <= n; b++){
                int c_s = (a * a) + (b * b);
                int c = (int)Math.sqrt(c_s);
                if(c * c == c_s && c <= n){
                    cnt++;
                }
            }
        }   
        return cnt;
    }
}