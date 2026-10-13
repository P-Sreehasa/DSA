class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int i = 1;
        while(x / i >= i){
            i++;
        }
        return i - 1;
    }
}