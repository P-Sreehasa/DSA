class Solution {
    public String concatHex36(int n) {
        int n1 = n * n;
        int n2 = n1 * n;
        String h = Integer.toHexString(n1).toUpperCase();
        String b = Integer.toString(n2, 36).toUpperCase();
        return h + b;
    }
}
