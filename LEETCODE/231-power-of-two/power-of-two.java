class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        } 
        while(n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}


/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){    // Power of a number is positive
            return false;    // If not, return false
        } 
        while(n % 2 == 0){    // As long as the power is divisible by 2:
            n /= 2;    // Divide it by 2
        }
        return n == 1;    // Return true is it's a power of 2, otherwise false
    }
}
*/