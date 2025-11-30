class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){
                sum += i;
            }
        }
        return sum;
    }
}


/*
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;    // Variable to store the sum 
        for(int i = 1; i <= n; i++){    // For each value from 1 to n:
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){    // If it is divisible by 3 or 5 or 7:
                sum += i;    // Add it to the sum
            }
        }
        return sum;    // Return the final sum
    }
}
*/