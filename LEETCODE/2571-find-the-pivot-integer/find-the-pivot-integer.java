class Solution {
    public int pivotInteger(int n) {
        int s = n * (n + 1) / 2;    
        for(int i = 1; i <= n; i ++){
            int l = i * (i + 1) / 2;
            int r = s - i * (i - 1) / 2;
            if(l == r){
                return i;
            }
        }
        return -1;
    }
}


/*
class Solution {
    public int pivotInteger(int n) {
        int s = n * (n + 1) / 2;    // For calculating the sum of elements from 1 to n:
        for(int i = 1; i <= n; i ++){    // For every element in the range of 1 to n:
            int l = i * (i + 1) / 2;    // Calculate sum from 1 to i
            int r = s - i * (i - 1) / 2;    // To calculate sum from i to n, calculate sum from i to (n - 1) and subtract it with sum (s)
            if(l == r){    // If both the sums are equal:
                return i;    // We return that element
            }
        }
        return -1;    // If the element is not found, return -1
    }
}
*/