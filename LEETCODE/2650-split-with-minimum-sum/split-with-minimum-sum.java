class Solution {
    public int splitNum(int num) {
        int d[] = new int[10];
        int len = 0;
        while(num > 0){
            d[len++] = num % 10;
            num /= 10;
        }
        Arrays.sort(d, 0, len);
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i < len; i++){
            if(i %2 == 0){
                n1 = n1 * 10 + d[i];
            } else{
                n2 = n2 * 10 + d[i];
            }
        }
        return n1 + n2;
    }
}
