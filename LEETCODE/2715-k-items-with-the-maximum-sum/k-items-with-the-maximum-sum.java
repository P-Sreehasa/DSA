class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        int ones = Math.min(k, numOnes);
        sum += ones;
        int zeros = Math.min(k - ones, numZeros);
        int negones = Math.min(k - ones - zeros, numNegOnes);
        sum -= negones;
        return sum;
    }
}   


/*
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;    // Variable to calculate the maximum possible sum
        int ones = Math.min(k, numOnes);    // Find the no.of ones
        sum += ones;    // Add ones to the sum
        int zeros = Math.min(k - ones, numZeros);    // If there are zeros, add them to not change the sum
        int negones = Math.min(k - ones - zeros, numNegOnes);    // If there are negative ones, find how many are left
        sum -= negones;    // Subtract the negative ones from the sum
        return sum;    // Return the final sum
    }
}   
*/