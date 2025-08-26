class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; i + j <= n; j += 2){
                for(int k = i; k < i + j; k++){
                    s += arr[k];
                }
            }
        }
        return s;
    }
}


/*
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s = 0;    // Variable for maintaining track of sum
        int n = arr.length;    // Calculates the length of the array
        for(int i = 0; i < n; i++){    // For every element in the array:
            for(int j = 1; i + j <= n; j += 2){    // Calculates the length of the sub-array, considering only the odd lengths [i + j - > checks for array length out of bounds condition]
                for(int k = i; k < i + j; k++){    // Foe every element of the odd-length sub-array:
                    s += arr[k];    // Add it to the sum variable
                }
            }
        }
        return s;    // Return the sum of all the elements
    }
}
*/