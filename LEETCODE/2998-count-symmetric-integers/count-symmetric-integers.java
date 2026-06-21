class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for(int i = low; i <= high; i++){
            String str = String.valueOf(i);
            int l = str.length();
            if(l % 2 != 0){
                continue;
            }
            int m = l / 2;
            int s = 0;
            for(int j = 0; j < l; j++){
                s += (str.charAt(j) - '0') * (j < m ? 1 : -1);
            }
            if(s == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;    // Variable to track count of symmetric integers
        for(int i = low; i <= high; i++){    // For every value in the range of low and high:
            String str = String.valueOf(i);    // Convert the integer to string
            int l = str.length();    // Calculate the no.of digits for it
            if(l % 2 != 0){    // If the no.of digits in the value is odd:
                continue;    // Skip it
            }
            int m = l / 2;    // Divide the value into 2 parts
            int s = 0;    // Variable for storing the difference between the sum of first and second parts
            for(int j = 0; j < l; j++){    // For every value in the range of the length:
                s += (str.charAt(j) - '0') * (j < m ? 1 : -1);    // Get the numeric value of the digit at that position and:
                if the digit in in the first part -> add it to sum
                else -> subtract it from sum
            }
            if(s == 0){    // If the digit sum is 0: 
                c++;    // Increment the count value
            }
        }
        return c;    // Return the final count
    }
}
*/