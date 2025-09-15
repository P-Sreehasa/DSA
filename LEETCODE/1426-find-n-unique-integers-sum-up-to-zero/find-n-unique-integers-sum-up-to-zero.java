class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        int c = 0;
        for(int i = 1; i <= n / 2; i++){
            res[c++] = -i;
            res[c++] = i;
        }
        if(n % 2 != 0){
            res[c] = 0;
        }
        return res;
    }
}


/*
class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];    // Array to store the result
        int c = 0;    // Variable to track the array index for storing the values
        for(int i = 1; i <= n / 2; i++){    // For each index in the range of the array:
            res[c++] = -i;    // Add the negative number to the array
            res[c++] = i;    // Add the positive number to the array (since, negative and positive sum up to 0)
        } 
        if(n % 2 != 0){    // If n is odd:
            res[c] = 0;    // Add 0 to maintain the correct count and the value of sum as 0
        }
        return res;    // Return the final array 
    }
}
*/