class Solution {
    public int countDigits(int num) {
        int o = num;
        int rem = 0;
        int c = 0;
        while(num > 0){
            rem = num % 10;
            if(o % rem == 0){
                c++;
            }
            num /= 10;
        }
        return c;
    }
}