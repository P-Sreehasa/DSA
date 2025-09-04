class Solution {
    public boolean isSameAfterReversals(int num) {
        int n1 = reverse(num);
        int n2 = reverse(n1);
        return n2 == num;
    }
    
    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int d = n % 10;
            rev = (rev * 10) + d;
            n /= 10;
        }
        return rev;
    }
}


/*
class Solution {
    public boolean isSameAfterReversals(int num) {
        int n1 = reverse(num);    // First reversal
        int n2 = reverse(n1);    // Second reversal
        return n2 == num;    // If the reversed number is same as the original, return true, else false
    }

    public static int reverse(int n){    // Function for reversing a number
        int rev = 0;    // Variable to store the reversed number
        while(n > 0){    // For each digit:
            int d = n % 10;    // Get the last digit
            rev = (rev * 10) + d;    // Append it to the reversed number
            n /= 10;    // Remove the last digit
        }
        return rev;    // Return the final reversed number
    }
}
*/