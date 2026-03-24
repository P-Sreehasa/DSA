class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for(int i = left; i <= right; i++){
            int sb = Integer.bitCount(i);
            if(sb < 2){
                continue;
            }
            boolean p = true;
            for(int j = 2; j * j <= sb; j++){
                if(sb % j == 0){
                    p = false;
                    break;
                }
            }
            if(p){
                c++;
            }
        }
        return c;
    }
}