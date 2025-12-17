class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while(n > 0){
            int remainder = n % k;
            sum += remainder;
            n /= k;
        }
        return sum;
    }
}


/*
class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;    // Variable to store the sum
        while(n > 0){    // As long as the number is greater than zero:
            int remainder = n % k;    // Get the remainder of n and k
            sum += remainder;    // Add it to the sum
            n /= k;    // Move to the next digit
        }
        return sum;    // Return the final sum of the digits
    }
}
*/