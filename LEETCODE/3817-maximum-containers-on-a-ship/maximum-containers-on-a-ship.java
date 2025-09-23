class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int mw = maxWeight / w;
        int c = n * n;
        return Math.min(mw, c);
    }
}


/*
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int mw = maxWeight / w;   // To calculate the no.of containers that can be fitted within the maxWeight
        int c = n * n;    // Calculate the total no.of cells
        return Math.min(mw, c);    // Return the minimum value of maxWeigth and no.of cells
    }
}
*/