class Solution {
    public int minimumSum(int num) {
        int i = 0;
        int d[] = new int[4];
        while(num > 0){
            d[i++] = num % 10;
            num /= 10;
        }
        java.util.Arrays.sort(d);
        int n1 = d[0] * 10 + d[2];
        int n2 = d[1] * 10 + d[3];
        return n1 + n2;
    }
}