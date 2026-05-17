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

