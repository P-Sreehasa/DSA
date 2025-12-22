class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        int minimum = Math.min(a, b);
        for(int i = 1; i <= minimum; i++){
            if((a % i == 0) && (b % i == 0)){
                count++;
            }
        }
        return count;
    }
}


/*
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;    // Variable to count the no.of common factors
        int minimum = Math.min(a, b);    // Find the minimum value between a and b
        for(int i = 1; i <= minimum; i++){    // For each value in the range of 1 to minimum:
            if((a % i == 0) && (b % i == 0)){    // If the current value is divisible by both a and b:
                count++;    // Increment the counter variable
            }
        }
        return count;    // Return the final count of the no.of common factors of a and b
    }
}
*/