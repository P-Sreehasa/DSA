class Solution {
    public int maxProduct(int n) {
        int l[] = new int[10];
        int r = 0;
        while(n > 0){
            l[r++] = n % 10;
            n /= 10; 
        }
        int p = 0;
        for(int i = 0; i < r; i++){
            for(int j = i + 1; j < r; j++){
                int prod = l[i] * l[j];
                p = Math.max(p, prod);
            }
        }
        return p;
    }
}


/*
class Solution {
    public int maxProduct(int n) {
        int l[] = new int[10];    // Array to store the digits of n
        int r = 0;    // Variable to track the no.of digits
        while(n > 0){    // As long as the value is greater than 0:
            l[r++] = n % 10;    // Get the last digit, store it in the array, and increment the count
            n /= 10;    // Remove the last digit
        }
        int p = 0;    // Variable to store the maximum-possible product
        for(int i = 0; i < r; i++){    // For each value in the range of 0 and result
            for(int j = i + 1; j < r; j++){    
                int prod = l[i] * l[j];    // Calculate the product
                p = Math.max(p, prod);    // Store the maximum of product and max-possible product in p
            }
        }
        return p;    // Return the product
    } 
}
*/