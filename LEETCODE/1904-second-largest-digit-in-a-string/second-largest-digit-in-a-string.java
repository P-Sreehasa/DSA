class Solution {
    public int secondHighest(String s) {
        int l = -1;
        int sl = -1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int d = c - '0';
                if(d > l){
                    sl = l;
                    l = d;
                } else if(d < l && d > sl){
                    sl = d;
                }
            }
        }
        return sl;
    }
}