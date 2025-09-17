class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int d[] = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = s.charAt(i) - '0';
        }
        while(n > 2){
            int nxt[] = new int[n - 1];
            for(int i = 0; i < n - 1; i++){
                nxt[i] = (d[i] + d[i + 1]) % 10;
            }
            d = nxt;
            n = d.length;
        }
        return d[0] == d[1];
    }    
}



/*
Solution - 1:

class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();    // Calculate the length of the string
        int d[] = new int[n];    // Array for storing values of size n
        for(int i = 0; i < n; i++){    // For each value in the array:
            d[i] = s.charAt(i) - '0';    // Convert the digits into numeric, by subtracting from 0
        }
        while(n > 2){    // As long as the length of the string is greater than 2:
            int nxt[] = new int[n - 1];    // Array to store digits
            for(int i = 0; i < n - 1; i++){    // For each value in the array:
                nxt[i] = (d[i] + d[i + 1]) % 10;    // Calculate the sum by adding 2 consecutive digits and store just the last digit
            } 
            d = nxt;    // Replace the old array with the new one
            n = d.length;    // Store the new array's length in n
        }
        return d[0] == d[1];    // If the 2 digits are same, return true, else false
    }    
}


Solution - 2: (TLE)

class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();    // Calculate the length of the string
        while(n > 2){    // While the length is greater than 2:
            int d[] = new int[n - 1];    // Create an array of size 1 less than the length of the array
            for(int i = 0; i < n - 1; i++){    // For each element in the array:
                int sum = (s.charAt(i) - '0' + s.charAt(i + 1) - '0') % 10;    // Calculate the sum of consecutive digits, and subtract from '0', to convert the char to int
                d[i] = sum;    // Store it in the array
            }
            s = "";    // Initialize the string as empty
            for(int i = 0; i < d.length; i++){    // For each value in the array:
                s += d;    // Append it to the string
            }
            n = s.length();    // Update n to the string's new length
        }
        return s.charAt(0) == s.charAt(1);    // If the 2 digits are same, return true, else false
    }
}
*/