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