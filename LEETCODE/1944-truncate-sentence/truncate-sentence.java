class Solution {
    public String truncateSentence(String s, int k) {
        String w[] = s.split(" "); 
        String res[] = new String[k]; 
        int n = w.length;
        for(int i = 0; i < k && i < n; i++) {
            res[i] = w[i];
        }
        return String.join(" ", res);
    }
}