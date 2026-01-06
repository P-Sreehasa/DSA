class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--){
            if((num.charAt(i) - '0') % 2 != 0){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}


/*
class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--){    // For each character in the string:
            if((num.charAt(i) - '0') % 2 != 0){    // If the current character's numerical value is odd:
                return num.substring(0, i + 1);    // Return the largest odd valued substring
            }
        }
        return "";    // If not, return an empty string
    }
}
*/