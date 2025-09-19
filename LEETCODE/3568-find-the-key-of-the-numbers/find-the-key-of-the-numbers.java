class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        String k = "";
        for(int i = 0; i <4; i++){
            char m = (char) Math.min(Math.min(str1.charAt(i), str2.charAt(i)), str3.charAt(i));
            k += m;
        }
        return Integer.parseInt(k);
    }
}


/*
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);    // Convert number1 to a string consisting of 4 digits
        String str2 = String.format("%04d", num2);    // Convert number2 to a string consisting of 4 digits
        String str3 = String.format("%04d", num3);    // Convert number3 to a string consisting of 4 digits
        String k = "";    // Variable to store the key
        for(int i = 0; i <4; i++){    // For each position in the key, extract the ith character from each string
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            char c3 = str3.charAt(i);
            char m = (char) Math.min(Math.min(c1, c2), c3);    // Finds the smallest (minimum) value at the current index
            k += m;    // Append it to the key
        }
        return Integer.parseInt(k);    // Convert the final string back to an integer
    }
}
*/