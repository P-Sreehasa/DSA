class Solution {
public:
    int sumBase(int n, int k) {
        int s = 0;
        while(n > 0){
            s += n % k;
            n /= k;
        }
        return s;
    }
};


/*
class Solution {
public:
    int sumBase(int n, int k) {
        int s = 0;    // Counter variable to track sum
        while(n > 0){    // As long as the number is greater than 0:
            s += n % k;    // Add the remainder of n and k to the sum
            n /= k;    // Remove the last digit of n in base-k and store it in n
        }
        return s;    // Return the final sum
    }
};
*/