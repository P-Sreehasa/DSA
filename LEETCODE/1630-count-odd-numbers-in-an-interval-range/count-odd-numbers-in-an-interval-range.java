class Solution {
    public int countOdds(int low, int high) {
        int h = (high + 1) / 2;
        int l = low / 2;
        return h - l;
    }
}