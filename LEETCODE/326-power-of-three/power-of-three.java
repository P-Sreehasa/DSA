class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}


/*
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){    // Power should be positive
            return false;    // If not, return false
        }
        while(n % 3 == 0){    // As long as the number is divisible by 3:
            n /= 3;    // Divide it by 3
        }
        return n == 1;    // If the value gets reduced to 1, it's a power of 3, otherwise not
    }
}
*/