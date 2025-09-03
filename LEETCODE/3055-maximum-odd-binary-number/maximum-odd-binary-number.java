class Solution {
    public String maximumOddBinaryNumber(String s) {
       int c = 0;
       for(char ch : s.toCharArray()){
        if(ch == '1'){
            c++;
        }
       }
       String start = "1". repeat(c - 1);
       String zero = "0". repeat(s.length() - c);
       String end = "1";
       return start + zero + end;
    }
}


/*
class Solution {
    public String maximumOddBinaryNumber(String s) {
       int c = 0;    // Variable to count no.of 1's
       for(char ch : s.toCharArray()){    // For each character in the string:
        if(ch == '1'){    // If the character is 1:
            c++;    // Increment the counter
        }
       }
       String start = "1". repeat(c - 1);    // Add (c - 1) 1's at the beginning
       String zero = "0". repeat(s.length() - c);    // Add 0's after 1's
       String end = "1";    // Add 1 at the end, to make the no.of 1's odd
       return start + zero + end;    // Return the final result
    }
}
*/