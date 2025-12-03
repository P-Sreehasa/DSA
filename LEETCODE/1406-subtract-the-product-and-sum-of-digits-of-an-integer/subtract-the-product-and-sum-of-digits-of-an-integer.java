class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0; 
        int product = 1;
        while(n > 0){
            int ld = n % 10;
            sum = sum + ld;
            product = product * ld;
            n /= 10;
        }
        return product - sum;
    }
}


/*
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;    // Variable to store the sum
        int product = 1;    // Variable to store the product
        while(n > 0){    // As long as the number is greater than 0:
            int ld = n % 10;    // Extract the last digit
            sum = sum + ld;    // Add it to the sum
            product = product * ld;    // Multiply it with the product
            n /= 10;    // Move to the next digit
        }
        return product - sum;    // The final result is the difference of product and sum
    }
}
*/