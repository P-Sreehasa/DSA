class Solution {
    public int scoreOfString(String s) {
        int p = 0;
        for(int i = 0; i < s.length() - 1; i++){
            int d = Math.abs(s.charAt(i) - s.charAt(i + 1));
            p += d;
        }
        return p;
    }
}

