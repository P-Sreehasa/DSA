class Solution {
    public int countDigits(int num) {
        int temp = num;
        int last_digit = 0;
        int count = 0;
        while(num > 0){
            last_digit = num % 10;
            if(temp % last_digit == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}


/*
class Solution {
    public int countDigits(int num) {
        int temp = num;    // Store the original number in a temporary variable
        int last_digit = 0;    // Variable to store the last digit of the number
        int count = 0;    // Variable to track the count of digits
        while(num > 0){    // As long as the number is greater than zero:
            last_digit = num % 10;    // Extract the last digit
            if(temp % last_digit == 0){    // If the original number is divisible by the last digit:
                count++;    // Increment the counter variable
            }
            num /= 10;    // Move to the next digit
        }
        return count;    // Return the final count
    }
}
*/