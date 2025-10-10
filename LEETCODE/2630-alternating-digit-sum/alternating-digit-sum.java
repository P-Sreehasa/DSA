class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        int s = 0;
        for(int i = 0; i < str.length(); i++){
            int d = str.charAt(i) - '0';
            if(i % 2 == 0){
                s += d;
            } else{
                s -= d;
            }
        }
        return s;
    }
}


/*
class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);    // Convert the integer n to a string and store it in a variable
        int s = 0;    // Variable for tracking sum
        for(int i = 0; i < str.length(); i++){    // For each character in the string:
            int d = str.charAt(i) - '0';    // Convert the character at the current index to an integer
            if(i % 2 == 0){    // If the value (i) is even:
                s += d;    // Add the current value to the sum variable
            } else{    // If the value (i) is odd:
                s -= d;    // Subtract the current value from the sum variable
            }
        }
        return s;    // Return the final sum
    }
}
*/