class Solution {
    public boolean hasSameDigits(String s) {
        int len = s.length();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = s.charAt(i) - '0';
        }
        for(int j = arr.length; j > 2; j--){
            for(int k = 0; k < j - 1; k++){
                arr[k] = (arr[k] +arr[k + 1]) % 10;
            }
        }
        return arr[0] == arr[1];
    }
}