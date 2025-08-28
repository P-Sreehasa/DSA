class Solution {
    public int sumOfMultiples(int n) {
        int s = 0;
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){
                s += i;
            }
        }
        return s;
    }
}


/*
class Solution {
    public int sumOfMultiples(int n) {
        int s = 0;    // Variable to keep track of the sum
        for(int i = 1; i <= n; i++){    // For each value in the range from 1 to n:
            if((i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0)){    // If the value is divisible by 3 or 5 or 7:
                s += i;    // Add it to sum
            }
        }
        return s;    // Return the sum of those elements
    }
}
*/