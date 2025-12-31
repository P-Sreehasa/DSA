class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            int value = columnTitle.charAt(i) - 'A' + 1;
            num = num * 26 + value;
        }
        return num;
    }
}



/*
class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;    // Variable to store the column number
        for(int i = 0; i < columnTitle.length(); i++){    // For each character of the input string:
            int value = columnTitle.charAt(i) - 'A' + 1;    // Store the numerical column value of the current character
            num = num * 26 + value;    // Multiply the current num value by 26 and add the current character value
        }
        return num;    // Return the final column number for the character(s)
    }
}
*/