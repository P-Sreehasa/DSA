class Solution {
    public int titleToNumber(String columnTitle) {
        int r = 0;
        int n = columnTitle.length();
        for(int i = 0; i < n; i++){
            int a = columnTitle.charAt(i) - 'A' + 1;
            r = r * 26 + a;
        }
        return r;
    }
}


/*
class Solution {
    public int titleToNumber(String columnTitle) {
        int r = 0;    Variable to track the result
        int n = columnTitle.length();    // Calculate the length of columnTitle
        for(int i = 0; i < n; i++){    // For each character:
            int a = columnTitle.charAt(i) - 'A' + 1;    // Calculate the numerical value of each letter (starts with 1)
            r = r * 26 + a;    // Multiply 26 by the numeric value and add it to the result variable
        }
        return r;    // Return the final result
    }
}
*/