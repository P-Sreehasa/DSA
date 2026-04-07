class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int c = 0;
        for(int i = 0; i <= s.length() - k; i++){
            String ss = s.substring(i, i + k);
            int n = Integer.parseInt(ss);
            if(n == 0){
                continue;
            }
            if(num % n == 0){
                c++;
            }
        }
        return c;
    }
}

