class Solution {
    public char kthCharacter(int k) {
        char[] w = new char[512];
        w[0] = 'a';
        int l = 1;
        while(l < k){
            for(int i = 0; i < l; i++){
                if(w[i] == 'z'){
                    w[l + i] = 'a';
                } else{
                    w[l + i] = (char)(w[i] + 1);
                }
            }
            l *= 2;
        }

        return w[k - 1];
    }
}
