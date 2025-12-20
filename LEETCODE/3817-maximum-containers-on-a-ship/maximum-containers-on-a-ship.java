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


/*
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int max = maxWeight / w;    // Calculate the maximum no.of containers by weight
        if(max <= n){    // As long as the maximum no.of containers is less than or equal to n:
            return max;    // Return it as the maximum
        }
        int c = n * n;    // No.of cells is calculated by n * n
        return Math.min(max, c);    // Return the minimum of both
    }
}
*/