class Solution {
    public int countEven(int num) {
        int c = 0;
        for(int i = 1; i <= num; i++){
            int s = 0;
            int l = i;
            while(l > 0){
                s += l % 10;
                l /= 10;
            }
            if(s % 2 == 0){
                c++;
            }
        }
        return c;
    }
};


/*
class Solution {
    public int countEven(int num) {
        int c = 0;    // Counter variable to track no.of even-summed digits
        for(int i = 1; i <= num; i++){    // For each value in the range of 1 and n:
            int s = 0;    // Variable to track sum of digits
            int l = i;    // Store the current value in the last-digit variable
            while(l > 0){    // As long as the last-digit is greater than 0:
                s += l % 10;    // Get the last digit and add it to sum
                l /= 10;    // Remove the last digit
            }
            if(s % 2 == 0){    // If the sum is even:
                c++;    // Increment the counter variable
            }
        }
        return c;    // Return the final count
    }
};
*/