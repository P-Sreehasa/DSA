class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int n : nums){
            String s = String.valueOf(n);
            char m = '0';
            for(char c : s.toCharArray()){
                if(c > m){
                    m = c;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                sb.append(m);
            }
            int sbn = Integer.parseInt(sb.toString());
            sum += sbn;
        }
        return sum;
    }
}

