class Solution {
    public boolean isSameAfterReversals(int num) {
        int o1 = num;
        int r1 = 0;
        int r2 = 0;
        while(num > 0){
            r1 = (r1 * 10) + (num % 10); 
            num /= 10;
        }
        int o2 = r1;
        while(o2 > 0){
            r2 = (r2 * 10) + (o2 % 10);
            o2 /= 10;
        }
        return r2 == o1;
    }
}