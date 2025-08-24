class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0; 
        int p = 1;
        while(n > 0){
            int r = n % 10;
            p *= r;
            s += r;
            n /= 10;
        }
        return p - s;
    }
}


/*
class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;    // Variable for maintaining track of sum
        int p = 1;    // Variable for maintaining track of product
        while(n > 0){    // So that product won't become 0
            int r = n % 10;    // Variable for storing the last digit (remainder)
            p *= r;    // Multiply product with result
            s += r;    // Add sum to result
            n /= 10;    // Remove the last digit
        }
        return p - s;    // Return the final subtracted value
    }
}
*/