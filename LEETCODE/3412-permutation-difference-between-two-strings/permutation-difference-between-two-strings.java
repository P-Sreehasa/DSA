class Solution {
    public int findPermutationDifference(String s, String t) {
        int pos[] = new int[26];
        int len_s = s.length();
        for(int i = 0; i < len_s; i++) {
            pos[s.charAt(i) - 'a'] = i;
        }
        int diff = 0;
        int len_t = s.length();
        for(int i = 0; i < len_t; i++) {
            diff += Math.abs(i - pos[t.charAt(i) - 'a']);
        }
        return diff;
    }
}