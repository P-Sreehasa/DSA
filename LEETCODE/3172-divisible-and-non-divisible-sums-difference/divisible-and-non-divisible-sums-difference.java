class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible = 0;
        int non_divisible = 0;
        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                divisible += i;
            } else{
                non_divisible += i;
            }
        }
        int res = non_divisible - divisible;
        return res;
    }
}


/*
class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible = 0;    // Variable to store the sum of the divisible integers of m
        int non_divisible = 0;    // Variable to store the sum of the non-divisible integers of m
        for(int i = 1; i <= n; i++){    // For each value in the range from 1 to n:
            if(i % m == 0){    // If the value is divisible by m:
                divisible += i;    // Add it to the divisible variable
            } else{    // If the value is not divisible by m:
                non_divisible += i;    // Add it to the non-divisible variable
            }
        }
        int res = non_divisible - divisible;    // Store the difference of the non-divisible and disible values
        return res;    // Return the result as the final result
    }
}
*/