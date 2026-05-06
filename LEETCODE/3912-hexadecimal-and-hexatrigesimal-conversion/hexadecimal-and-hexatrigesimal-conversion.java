class Solution {
    public String concatHex36(int n) {
        int n1 = n * n;
        int n2 = n1 * n;
        String h = Integer. toHexString(n1).toUpperCase();
        String b = Integer.toString(n2, 36).toUpperCase();
        return h + b;
    }
}


/*
class Solution {
    public String concatHex36(int n) {
        int n1 = n * n;    // Calculate n^2, which will be converted to hexadecimal string
        int n2 = n1 * n;    // Calculate n^3, which will be converted to hexatrigesimal string
        String h = Integer. toHexString(n1).toUpperCase();    // Converts an integer to hexadecimal and convert it to uppercase
        String b = Integer.toString(n2, 36).toUpperCase();    // Converts an integer to hexatrigesimal and convert it to uppercase
        return h + b;    // Return the final result as a string 
    }
}
*/