class Solution {
    public int splitNum(int num) {
        int d[] = new int[10];
        int len = 0;
        while(num > 0){
            d[len++] = num % 10;
            num /= 10;
        }
        Arrays.sort(d, 0, len);
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < len; i++){
            if(i %2 == 0){
                n1 = n1 * 10 + d[i];
            } else{
                n2 = n2 * 10 + d[i];
            }
        }
        return n1 + n2;
    }
}


/*
class Solution {
    public int splitNum(int num) {
        int d[] = new int[10];    // Array for storing the digits of the number
        int len = 0;    // Variable to track the no.of extracted digits
        while(num > 0){    // As long as the number is greater than 0:
            d[len++] = num % 10;    // Extract the last digit and store it in the digits array (and then increment the index)
            num /= 10;    // Remove the last digit
        }
        Arrays.sort(d, 0, len);    // Sort the digits array from 0 to len-1
        int n1 = 0;    // Initialize 2 variables to divide the number into 2 numbers:
        int n2 = 0;
        for(int i = 0; i < len; i++){    // For each value in the sorted array:
            if(i %2 == 0){    // If the current index is even:
                n1 = n1 * 10 + d[i];    // Append it to the first number
            } else{    // If the current index is odd:
                n2 = n2 * 10 + d[i];    // Append it to the second number
            }
        }
        return n1 + n2;    // Return the sum of both the numbers
    }
}
*/