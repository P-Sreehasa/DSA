class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int s = 0;
        int p = 1;
        while(n > 0){
            int l = n % 10;
            s += l;
            p *= l;
            n /= 10;
        }
        int t = s + p;
        return num % t == 0;
    }
}


/*
class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;    // Variable to store the input number
        int s = 0;    // Variable to store the sum
        int p = 1;    // Variable to store the product
        while(n > 0){    // As long as the number is greater than 0:
            int l = n % 10;    // Extract the last digit
            s += l;    // Add the last digit to the sum
            p *= l;    // Multiply the last digit with the product
            n /= 10;    // Remove the last digit
        }
        int t = s + p;    // Variable to store the total
        return num % t == 0;    // Return the value based on divisibility
    }
}
*/