class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int max = maxWeight / w;
        if(max <= n){
            return max;
        }
        int c = n * n;
        return Math.min(max, c);
    }
}