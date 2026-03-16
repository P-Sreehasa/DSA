class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int l = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                if(l > 0){
                    res += c;
                } 
                l++;
            } else if(c == ')') {
                l--;
                if(l > 0){
                    res += c;
                } 
            }
        }
        return res;
    }
}