class Solution {
    public int romanToInt(String s) {
        int arr[] = new int[128];
        arr['I'] = 1;
        arr['V'] = 5;
        arr['X'] = 10;
        arr['L'] = 50;
        arr['C'] = 100;
        arr['D'] = 500;
        arr['M'] = 1000;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            int c = arr[s.charAt(i)];
            if(i < s.length() - 1 && c < arr[s.charAt(i + 1)]){
                res -= c;
            } else{
                res += c;
            }
        }
        return res;
    }
}