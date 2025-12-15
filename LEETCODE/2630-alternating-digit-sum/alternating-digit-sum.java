class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int v = 0;
        int b = 1;
        for(int i = 0; i < s.length(); i++){
            int ld = s.charAt(i) - '0';
            v += b * ld;
            b *= -1;
        }
        return v;
    }
}