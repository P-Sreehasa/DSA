class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean n = num < 0;
        num = Math.abs(num);
        String res = "";
        while(num > 0){
            res = (num % 7) + res;
            num /= 7;
        }
        if(n){
            res = "-" + res; 
        }
        return res;
    }
}


/*
class Solution {
    public String convertToBase7(int num) {
        if(num == 0){    // If the number is 0:
            return "0";    // Return "0"
        }
        boolean n = num < 0;    // Check if the number is negative
        num = Math.abs(num);    // Consider the absolute value of the number
        String res = "";    // Variable to store the result
        while(num > 0){    // As long as the number is greater than 0:
            res = (num % 7) + res;    // Add the remainder to the result
            num /= 7;    // Move to the next digit
        }
        if(n){    // If the number is negative:
            res = "-" + res;     // Add a negative sign
        }
        return res;    // Return the final result
    }
}
*/