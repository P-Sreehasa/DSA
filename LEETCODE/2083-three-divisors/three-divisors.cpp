class Solution {
public:
    bool isThree(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count != 3){
            return false;
        }
        return true;
    }
};


/*
class Solution {
public:
    bool isThree(int n) {
        int count = 0;    // Variable to store the count of the no.of divisors
        for(int i = 1; i <= n; i++){    // For each value from 1 to n:
            if(n % i == 0){    // If n is divisible by i:
                count++;    // Increment the counter variable
            }
        }
        if(count != 3){    // If the count is not equal to 3:
            return false;    // Return false
        }
        return true;    // If the count is equal to 3, return true
    }
};
*/