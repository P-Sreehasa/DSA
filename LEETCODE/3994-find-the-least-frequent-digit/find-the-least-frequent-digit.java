class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[] = new int[10];
        while(n > 0){
            int l = n % 10;
            a[l]++;
            n /= 10;
        }
        int minn = Integer.MAX_VALUE;
        int r = -1;
        for(int i = 0; i < 10; i++){
            if(a[i] > 0 && a[i] < minn){ 
                minn = a[i];
                r = i;
            } else if(a[i] == minn && i < r){
                r = i;
            }
        }
        return r;
    }
}
