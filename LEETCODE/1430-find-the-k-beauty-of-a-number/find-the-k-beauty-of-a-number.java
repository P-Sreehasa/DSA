class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int c = 0;
        for(int i = 0; i <= s.length() - k; i++){
            String ss = s.substring(i, i + k);
            int n = Integer.parseInt(ss);
            if(n == 0){
                continue;
            }
            if(num % n == 0){
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);    // Convert the integer to string
        int c = 0;    // Variable to track count 
        for(int i = 0; i <= s.length() - k; i++){    // For each string of 'K' length:
            String ss = s.substring(i, i + k);    // Extract sub-string of 'K' length from i 
            int n = Integer.parseInt(ss);    // Convert the string back to integer
            if(n == 0){    // If sub-string is 0:
                continue;    // Skip it
            }
            if(num % n == 0){    // If the number is divisible by the sub-string:
                c++;    // Increment the counter variable
            }
        }
        return c;    // Return the final count
    }
}
*/