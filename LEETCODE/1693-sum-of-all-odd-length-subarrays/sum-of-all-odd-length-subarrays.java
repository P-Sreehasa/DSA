class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 1; i + j <= n; j += 2){
                for(int k = i; k < i + j; k++){
                    s += arr[k];
                }
            }
        }
        return s;
    }
}

