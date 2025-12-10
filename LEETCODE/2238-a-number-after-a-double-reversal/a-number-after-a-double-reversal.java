class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0){
            return true;
        }
        int rev = num % 10;
        if(rev == 0){
            return false;
        }
        return true;
    }
}