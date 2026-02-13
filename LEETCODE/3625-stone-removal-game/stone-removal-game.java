class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        int temp = n;
        int t = 1;
        int s = 10;
        while(temp >= s){
            temp -= s;
            s--;
            t = 1 - t;
        }
        return t == 0;
    }
}

