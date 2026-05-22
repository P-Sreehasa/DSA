class Solution {
    public int findPermutationDifference(String s, String t) {
        int pos[] = new int[26];
        int s_l = s.length();
        for(int i = 0; i < s_l; i++){
            pos[s.charAt(i) - 'a'] = i;
        }
        int diff = 0;
        int t_l = s.length();
        for(int i = 0; i < t_l; i++){
            diff += Math.abs(i - pos[t.charAt(i) - 'a']);
        }
        return diff;
    }
}
