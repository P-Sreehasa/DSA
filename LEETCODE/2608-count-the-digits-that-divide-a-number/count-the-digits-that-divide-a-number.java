class Solution {
    public int countDigits(int num) {
        int t = num;
        int c = 0;
        while(num > 0){
            int r = num % 10;
            if(r != 0 && t % r == 0){
                c++;
            }
            num /= 10;
        }
        return c;
    }
}


/*
class Solution {
    public int countDigits(int num) {
        int t = num;    // Temporary variable for checking divisibility
        int c = 0;    // Count variable for maintaining track of digits that divide the number
        while(num > 0){    // For every digit in the number:
            int r = num % 10;    // Extract the last digit
            if(r != 0 && t % r == 0){    // As long as the last digit isn't 0 and the the temporary number divides it: 
                c++;    // Increment the count variable
            }
            num /= 10;    // Remove the last digit
        }
        return c;    // Return the count of the no.of digits that divide the number
    }
}
*/