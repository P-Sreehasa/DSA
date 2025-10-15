class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int num = n;
        int p = 1;
        boolean z = false;
        while(num > 0){
            int l = num % 10;
            if(l == 0){
                z = true;
                break;
            }
            p *= l;
            num /= 10;
        }
        if(z){
            p = 0;
        }
        if(p % t == 0){
            return n;
        }
        n++;
        }
    }
}


/*
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){    // Check if the number starts with n
            int num = n;    // Store n in a new variable
        int p = 1;    // Variable to track the product
        boolean z = false;    // Variable to check if there's 0
        while(num > 0){    // As long as the number is greater than 0:
            int l = num % 10;    // Extract the last digit
            if(l == 0){    // If the last digit is equal to 0:
                z = true;    // Product becomes 0:
                break;    // So, break the loop
            }
            p *= l;    // Multiply the last digit with the product
            num /= 10;    // Remove the last digit
        }
        if(z){    // If any value is 0:
            p = 0;    // The product becomes 0
        }
        if(p % t == 0){    // If the product is divisible by t:
            return n;    // Return the value
        }
        n++;    // Increment the value to the number
        }
    }
}
*/