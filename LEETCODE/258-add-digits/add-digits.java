class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}


/*
class Solution {
    public int addDigits(int num) {
        while(num >= 10){    // As long as there is more than 1 digit in the number:
            int sum = 0;    // Variable to store the sum
            while(num > 0){    // As long as the number is greater than 0:
                sum += num % 10;    // Add the last digit to the sum
                num /= 10;    // Move to the next digit
            }
            num = sum;    // Store the sum in number
        }
        return num;    // Return the final sum of the digits of the number
    }
}
*/