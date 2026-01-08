class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }
}


/*
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){    // If the number is not greater than 0:
            return false;    // Return false
        }
        while(n % 4 == 0){    // As long as n is a multiple of 4:
            n /= 4;    // Divide n by 4 to reduce it
        }
        return n == 1;    // Return true is n is a power of 4, else false
    }
}
*/