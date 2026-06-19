class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c = 0;
        for(int i = low; i <= high; i++){
            String str = String.valueOf(i);
            int l = str.length();
            if(l % 2 != 0){
                continue;
            }
            int m = l / 2;
            int s = 0;
            for(int j = 0; j < l; j++){
                s += (str.charAt(j) - '0') * (j < m ? 1 : -1);
            }
            if(s == 0){
                c++;
            }
        }
        return c;
    }
}
