class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums){
            int d = 0;
            int t = n;
            while(t != 0){
                t /= 10;
                d++;
            }
            if(d % 2 == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;    // Variable to track count of even digits in the numbers
        for(int n : nums){    // For each value in the array:
            int d = 0;    // Variable to track the count of digits in each number
            int t = n;    // Store the number in a temporary variable
            while(t != 0){    // As long as the temporary number is not zero:
                t /= 10;    // Remove the last digit
                d++;    // Increment digit variable's count
            }
            if(d % 2 == 0){    // If the count of digits is even:
                c++;    // Increment the counter variable's value
            }
        }
        return c;    // Return the final count
    }
}
*/